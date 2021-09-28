package com.company;

import java.util.Date;

public class Tweet {
    String body;
    Integer id;
    Date date;
    private Tweet next;

    public Tweet getNext() {
        return next;
    }

    public void setNext(Tweet next) {
        this.next = next;
    }

    public Tweet(){

    }

    public Tweet(String body, Integer id) {
        this.body = body;
        this.id = id;
        this.date = new Date();
        this.next = null;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
