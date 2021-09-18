package com.company.account;

public abstract class Account {
    String username;
    String password;
    AccountType type;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Account(AccountType type){
        this.type = type;
    }
}
