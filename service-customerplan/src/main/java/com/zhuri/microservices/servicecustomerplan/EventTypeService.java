package com.zhuri.microservices.servicecustomerplan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EventTypeService {
    @Autowired
    EventTypeMapper eventTypeMapper;

    public int addEventType() {
        EventType et = new EventType();
        et.setName("TestD");
        et.setCreateMan(1);
        et.setCreateTime(new Date());
        return eventTypeMapper.addEventType(et);
    }

    public int enableEventType() {
        return eventTypeMapper.enableEventType(4, false);
    }

    public int updateEventType() {
        return 0;
    }

    public EventType getEventType() {
        return null;
    }

    public List<EventType> getAllEventType() {
        return eventTypeMapper.getAllEventType();
    }

}