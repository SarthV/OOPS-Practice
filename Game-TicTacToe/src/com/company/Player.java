package com.company;

public class Player {
    String name;
    int id;
    char letter;
    public Player(String Name, char Letter, int Id) {
        name = Name;
        letter = Letter;
        id= Id;
    }

    public Player() {
        id = -1;
        letter = 'p';
        name = "No_One";
    }
}
