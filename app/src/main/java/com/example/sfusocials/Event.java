package com.example.sfusocials;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Event {

//    private Integer eventID;
    private String duration;
    private String hostName;
    private String eventName;
    private String startTime;
//    private String tags;


    public Event() {

    }

    public Event(String duration, String hostName, String eventName, String startTime) {
//        this.eventID = eventID;
        this.duration = duration;
        this.hostName = hostName;
        this.eventName = eventName;
        this.startTime = startTime;
    }

//    public Integer getEventID() {
//        return eventID;
//    }

    public String getDuration() {
        return duration;
    }

    public String getHostName() {
        return hostName;
    }

    public String getEventName() {
        return eventName;
    }

    public String getStartTime() {
        return startTime;
    }
}
