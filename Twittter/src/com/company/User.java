package com.company;

import java.util.HashMap;

public class User {
    private String name;
    private Integer id;
    private HashMap<Integer, User> followers = new HashMap<>();
    private HashMap<Integer, User> following = new HashMap<>();
    

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public HashMap<Integer, User> getFollowers() {
        return followers;
    }

    public void setFollowers(HashMap<Integer, User> followers) {
        this.followers = followers;
    }

    public HashMap<Integer, User> getFollowing() {
        return following;
    }

    public void setFollowing(HashMap<Integer, User> following) {
        this.following = following;
    }


    public User(){

    }

    public User(Integer id, String name){
        this.name = name;
        this.id = id;
    }

    public void followUser(User userToBeFollowed){
        following.put(userToBeFollowed.id,  userToBeFollowed);
        userToBeFollowed.followers.put(this.id, this);
    }
}
