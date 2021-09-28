package com.company;

import java.util.Date;

public class Tweet {
    String body;
    Integer id;
    Date date;

    public Tweet(){

    }

    public Tweet(String body, Integer id, Date date) {
        this.body = body;
        this.id = id;
        this.date = date;
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
