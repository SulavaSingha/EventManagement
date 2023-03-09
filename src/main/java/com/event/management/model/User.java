package com.event.management.model;

import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;

import java.util.HashMap;
import java.util.Map;

public class User{
    private final String name;
    private final String id;
    private final TimeSlot timeSlot;
    private  Events event;
    private Team team;

    public User(String name, String id, TimeSlot timeSlot) {
        this.name = name;
        this.id = id;
        this.timeSlot =timeSlot;
    }
    public String getId() {
        return id;
    }
    public TimeSlot getWorkingHours(){
        return this.timeSlot;
    }
    public void setTeam(Team team){
    this.team =team;
    }
    public Team getTeam() {
        return this.team;
    }
    public void setEvent(Events event){
    this.event=event;
    }
    public Events getEvent(){
        return this.event;
    }

    public String getName() {
        return getName();
    }
}
