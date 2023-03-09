package com.event.management.model;

import java.util.List;

public class Representative {
    private final List<User> representative ;
    private final String teamId;


    public Representative(List<User> representative, String teamId) {
        this.representative = representative;
        this.teamId = teamId;

    }
}
