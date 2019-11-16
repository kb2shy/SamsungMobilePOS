package com.chhaianpin.samsungmobilepos;

public class User {
    private String userID;
    private String password;

    public User(String userID, String password) {
        this.userID = userID;
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }
}
