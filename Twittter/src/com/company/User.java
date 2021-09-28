package com.company;

import javafx.util.Pair;

import java.util.*;

public class User {
    private String name;
    private Integer id;
    private HashMap<Integer, User> followers = new HashMap<>();
    private HashMap<Integer, User> following = new HashMap<>();
    private HashMap<Integer, Tweet> tweetMap = new HashMap<>();
    Tweet head = new Tweet();

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public HashMap<Integer, User> getFollowers() {
        return followers;
    }

    public HashMap<Integer, User> getFollowing() {
        return following;
    }

    public User(){

    }

    public User(Integer id, String name){
        this.name = name;
        this.id = id;
        following.put(id, this);
    }

    public void followUser(User userToBeFollowed){
        following.put(userToBeFollowed.id,  userToBeFollowed);
        userToBeFollowed.followers.put(this.id, this);
    }

    public void addTweet(Tweet tweet){
        tweet.setNext(head.getNext());
        head.setNext(tweet);
        tweetMap.put(tweet.getId(), tweet);
    }

    public void deleteTweet(int tweetID){
        if(tweetMap.containsKey(tweetID)){
            Tweet temp = head.getNext();
            Tweet tracker = head;
            while(temp != null){
                if(temp.getId() == tweetID){
                    tracker.setNext(temp.getNext());
                    temp.setNext(null);
                    tweetMap.remove(tweetID);
                    break;
                }
                temp = temp.getNext();
                tracker = tracker.getNext();
            }
        }
        else{
            System.out.println("No such tweet exists!");
        }
    }

    public Tweet getTweet(int tweetID){
        if(tweetMap.containsKey(tweetID)){
            return tweetMap.get(tweetID);
        }
        else{
            //Avoiding throwing exceptions for the program to not break
            System.out.println("No such tweet exists!");
        }
        return null;
    }

    //Comparator.comparing(Pair::getKey)

    public List<Tweet> getFeed(int maxTweetsOnPage){
        System.out.println("Here is " + this.name + "'s feed!");
        PriorityQueue<Pair<Date, Tweet>> pq = new PriorityQueue<>(maxTweetsOnPage* following.size(), Collections.reverseOrder(Comparator.comparing(Pair::getKey)));
        int count = 0;
        for(User followee : following.values()){
            Tweet temp = followee.head.getNext();
            count  = 0;
            while(count < maxTweetsOnPage && temp != null){
                Pair<Date, Tweet> p = new Pair<Date, Tweet>(temp.getDate(), temp);
                pq.add(p);
                temp = temp.getNext();
                count++;
            }
        }

        count = 0;
        List<Tweet> result = new ArrayList<>();

        while(!pq.isEmpty() && count < maxTweetsOnPage){
            Tweet tweet = pq.poll().getValue();
            result.add(tweet);
            System.out.println(tweet.getBody() + " --- posted at " + tweet.date);
            count++;
        }
        return result;
    }
}
