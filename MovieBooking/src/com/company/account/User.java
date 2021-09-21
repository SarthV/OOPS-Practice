package com.company.account;

import com.company.CinemaSeat;
import com.company.MovieTicket;

public class User {
    String name;
    MovieTicket ticket;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MovieTicket getTicket() {
        return ticket;
    }

    public void setTicket(MovieTicket ticket) {
        this.ticket = ticket;
    }

    public User(){
        this.ticket = new MovieTicket();
    }

    public User(String name){
        this.ticket = new MovieTicket();
        this.name = name;
    }
}
