package com.assignment.UniversityEventManagement.Controller;

import com.assignment.UniversityEventManagement.Model.Event;
import com.assignment.UniversityEventManagement.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

//    Add event
    @PostMapping("event")
        public String addEvent(@RequestBody Event event){
        return eventService.addEvent(event);
    }

//    Update event
    @PutMapping("event/id/{eventId}")
        public String updateEvent(@PathVariable Integer eventId,@RequestParam String locationOfEvent){
        return eventService.updateEvent(eventId,locationOfEvent);
    }

//    Delete event
    @DeleteMapping("event")
    public String deleteEvent(@RequestParam Integer eventId){
        return eventService.deleteEvent(eventId);
    }
//    Get All events by date
    @GetMapping("events")
    public List<Event> getAllEventsByDate(@RequestParam LocalDate date){
        return eventService.getAllEvents(date);
    }
}

