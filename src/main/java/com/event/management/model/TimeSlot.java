package com.event.management.model;

import org.joda.time.DateTime;

public class TimeSlot {
    private final DateTime loginTime;
    private final DateTime logutTime;

    public TimeSlot(DateTime loginTime, DateTime logutTime) {
        this.loginTime = loginTime;
        this.logutTime = logutTime;
    }

    public DateTime getLoginTime() {
        return loginTime;
    }

    public DateTime getLogutTime() {
        return logutTime;
    }
}
