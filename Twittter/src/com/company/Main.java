package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Admin admin = new Admin();
        User user1 = admin.createUser(1, "Sarth");
        User user2 = admin.createUser(2, "Parth");
        user1.followUser(user2);

        //Testing
//        for(User u : user1.getFollowing().values()){
//            System.out.println(u.getName());
//        }
//        for(User u : user2.getFollowers().values()){
//            System.out.println(u.getName());
//        }
    }
}
