package com.event.management.comparator;

import com.event.management.model.TimeSlot;

import java.util.Comparator;

public class TimeSlotComparator implements Comparator<TimeSlot> {

    public int compare(TimeSlot userTimeSlot, TimeSlot eventTimeSlot) {
         if(userTimeSlot.getLoginTime().getHourOfDay()<eventTimeSlot.getLoginTime().getHourOfDay() &&
         userTimeSlot.getLogutTime().getHourOfDay()>eventTimeSlot.getLogutTime().getHourOfDay()){
             return -1;
         }
         else if(userTimeSlot.getLoginTime().getHourOfDay()>eventTimeSlot.getLoginTime().getHourOfDay() &&
                 userTimeSlot.getLogutTime().getHourOfDay()<eventTimeSlot.getLogutTime().getHourOfDay()){
             return 1;
         }
         return 0;
    }
}
