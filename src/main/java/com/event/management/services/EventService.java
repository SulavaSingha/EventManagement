package com.event.management.services;

import com.event.management.comparator.TimeSlotComparator;
import com.event.management.dao.EventDao;
import com.event.management.model.Events;
import com.event.management.model.TimeSlot;
import com.event.management.model.User;

import java.awt.*;
import java.util.List;

public class EventService {
    private UserService userService;
    private TeamService teamService;
    private EventDao eventDao;
    public EventService(){
        this.userService = new UserService();
        this.teamService = new TeamService(userService);
        this.eventDao = new EventDao();
    }

    public  void createEvent(String event1, List<String> users, List<String> teams, TimeSlot timeSlot, int numOfRepresentative) {

        Events event = new Events(event1,timeSlot);
        for(String userId:users){
            User user = this.userService.getUserDetails(userId);
            if(user.getEvent()!=null){
                throw new RuntimeException("cannot add user to this event");
            }
            TimeSlotComparator comparator = new TimeSlotComparator();
            if(comparator.compare(user.getWorkingHours(), timeSlot)==1){
                throw new RuntimeException("event is outside users working hours : ");
            }
            event.addUsers(user);
        }
        eventDao.addEvents();
    }

    public void createEvents(){

    }
}
