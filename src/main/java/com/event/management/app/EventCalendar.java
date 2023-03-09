package com.event.management.app;

import com.event.management.model.TimeSlot;
import com.event.management.services.EventService;
import com.event.management.services.TeamService;
import com.event.management.services.UserService;

import java.util.List;

public class EventCalendar {
    private UserService userService;
    private TeamService teamService;
    private EventService eventService;

    public EventCalendar() {
    this.userService = new UserService();
    this.teamService = new TeamService();
    this.eventService = new EventService();
    }
    public void createEvent(){

    }

    public void createUser(String name, String id, TimeSlot timeSlot) {
        userService.createUsers(name,id,timeSlot);
    }
    public void createTeam(String id, String name, List<String> userIds){
        teamService.createTeam(id,name,userIds);
    }

    public void createEvent(String event1, List<String> users, List<String> teams, TimeSlot timeSlot, int numOfRepresentative) {
        eventService.createEvent(event1,users,teams,timeSlot,numOfRepresentative);
    }
}
