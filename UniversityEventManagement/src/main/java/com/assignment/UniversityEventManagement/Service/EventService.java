package com.assignment.UniversityEventManagement.Service;

import com.assignment.UniversityEventManagement.Model.Event;
import com.assignment.UniversityEventManagement.Repo.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EventService {
    @Autowired
    IEventRepo eventRepo;

    public String addEvent(Event event) {
        eventRepo.save(event);
        return "event added successfully";
    }

    public String updateEvent(Integer eventId, String locationOfEvent) {
        Event event = eventRepo.findById(eventId).orElse(null);
        if(event!=null){
            event.setLocationOfEvent(locationOfEvent);
            eventRepo.save(event);
            return "Event updated succussfully";
        }else return "Not found event";
    }

    public String deleteEvent(Integer eventId) {
        eventRepo.deleteById(eventId);
        return "Event deleted Successfully";
    }

    public List<Event> getAllEvents(LocalDate date) {
        return eventRepo.findByDate(date);
    }
}
