package com.demo.resourceserver.model;

/**
 * Created by macintosh on 7/28/17.
 */
public class Message {

    private String username;
    private String message;
    private String uid;

    public Message() {
    }

    public Message(String username, String message, String uid) {
        this.username = username;
        this.message = message;
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
