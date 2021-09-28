package com.company;

import java.util.HashMap;

public class Admin {
    private HashMap<Integer, User> allUsers = new HashMap<>();

    public HashMap<Integer, User> getAllUsers() {
        return allUsers;
    }

    public Admin(){

    }

    public User createUser(Integer id, String name){
        User u =  new User(id, name);
        allUsers.put(id, u);
        return u;
    }
}
