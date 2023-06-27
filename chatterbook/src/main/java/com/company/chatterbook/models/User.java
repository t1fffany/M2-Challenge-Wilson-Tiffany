package com.company.chatterbook.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private List<ChatterPost> chatterPosts;
    public User(String name) {
        this.name = name;
    }

    public void setChatterPosts(List<ChatterPost> chats) {
        this.chatterPosts = chats;
    }

    public List<ChatterPost> getChatterPosts() {
        return chatterPosts;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
