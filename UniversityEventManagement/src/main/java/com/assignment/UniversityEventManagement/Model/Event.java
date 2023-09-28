package com.assignment.UniversityEventManagement.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Event {

    @Id
    private Integer eventId;

    @NotBlank
    private String   eventName;

    @NotBlank
   private String  locationOfEvent;

   private LocalDate date;
@JsonFormat(pattern = "HH:mm")
   private Date startTime;
@JsonFormat(pattern = "HH:mm")
   private Date endTime;
}
