package com.event.management.app;

import com.event.management.exceptions.BadRequestException;
import com.event.management.exceptions.UserException;
import com.event.management.model.TimeSlot;
import com.event.management.model.User;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) throws BadRequestException, UserException {

        EventCalendar eventCalendar = new EventCalendar();
        eventCalendar.createUser("A","1",new TimeSlot(new DateTime().withTime(10,0,0,0),new DateTime().withTime(19,0,0,0)));
        eventCalendar.createUser("B","2",new TimeSlot(new DateTime().withTime(9,30,0,0),new DateTime().withTime(17,30,0,0)));
        eventCalendar.createUser("C","3",new TimeSlot(new DateTime().withTime(10,0,0,0),new DateTime().withTime(18,0,0,0)));
        eventCalendar.createUser("D","4",new TimeSlot(new DateTime().withTime(11,0,0,0),new DateTime().withTime(19,30,0,0)));
        eventCalendar.createUser("E","5",new TimeSlot(new DateTime().withTime(11,0,0,0),new DateTime().withTime(19,30,0,0)));
        eventCalendar.createUser("F","6",new TimeSlot(new DateTime().withTime(11,0,0,0),new DateTime().withTime(18,30,0,0)));

        eventCalendar.createTeam("1","T1",new Arrays.asList(new String[]{"3", "5"}));
        eventCalendar.createTeam("2","T2",new Arrays.asList(new String[]{"2","4","6"}));
        eventCalendar.createEvent("Event1",Arrays.asList(new String[]{"1"}),Arrays.asList(new String[]{"1"}),new TimeSlot
                (new DateTime().plusDays(1).withTime(14,0,0,0),new DateTime().plusDays(1).withTime(15,0,0,0)),2);





    }
}
