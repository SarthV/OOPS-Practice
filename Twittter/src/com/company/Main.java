package com.company;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        Admin admin = new Admin();
        User user1 = admin.createUser(1, "Sarth");
        User user2 = admin.createUser(2, "Parth");

        //Testing
//        for(User u : user1.getFollowing().values()){
//            System.out.println(u.getName());
//        }
//        for(User u : user2.getFollowers().values()){
//            System.out.println(u.getName());
//        }
        Tweet myTweet = new Tweet("My name is Sarth", 1);
        user1.addTweet(myTweet);

        TimeUnit.SECONDS.sleep(3);
        Tweet myTweet1 = new Tweet("A SDE ig", 2);
        user1.addTweet(myTweet1);

        TimeUnit.SECONDS.sleep(2);
        Tweet parthTweet1 = new Tweet("My name is Parth", 3);
        user2.addTweet(parthTweet1);

        TimeUnit.SECONDS.sleep(1);
        Tweet parthTweet2 = new Tweet("Not a SDE", 4);
        user2.addTweet(parthTweet2);

        user1.followUser(user2);

        // Have included the printing of tweets in the "getFeed()" function itself.
        List<Tweet> feed1 = user1.getFeed(5);

        System.out.println("");
        List<Tweet> feed2 = user2.getFeed(5);
    }
}
