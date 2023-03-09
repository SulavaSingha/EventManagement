package com.event.management.model;

import java.util.ArrayList;
import java.util.List;

public class Events {


    private final String eventId;
    private final TimeSlot timeSlot;
    private List<User> users ;
    private List<Team> teams;
    public Events(String event1, TimeSlot timeSlot) {
        this.eventId =event1;
        this.timeSlot =timeSlot;
        this.users = new ArrayList<User>();
        this.teams = new ArrayList<Team>();
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }
    public List<User> getParticipants(){
        return this.users;
    }


    public String getEventId() {
        return eventId;
    }
    public void addUsers(User user){
        this.users.add(user);
    }
    public void addTeams(Team team){
        this.teams.add(team);
    }

}
