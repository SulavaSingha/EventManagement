package com.event.management.model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private final String id;
    private final String name;
    private List<User> users;

    public Team(String id, String name) {
        this.id = id;
        this.name = name;
    this.users = new ArrayList<User>();
    }
    public List<User> getTeamMembers(){
        return users;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setTeamMembers(User user) {
        this.users.add(user);
    }
}
