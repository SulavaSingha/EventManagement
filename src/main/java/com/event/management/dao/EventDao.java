package com.event.management.dao;

import com.event.management.model.Events;
import com.event.management.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventDao {
    private final Map<Events, List<User>> eventMap;

    public EventDao(){
        this.eventMap = new HashMap<Events,List<User>>();
    }
    public void addEvents(Events event){
    eventMap.put(event,event.getParticipants());
    }
}
