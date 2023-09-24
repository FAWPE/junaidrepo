package com.assignment.Jobportal.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Job {
    @Id
    @NotNull
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @NotBlank(message = "Location cannot be blank")
    private String location;


    @Min(20000)
    private Double salary;

    @Email(message = "Not a valid email")
    private String companyEmail;


    @NotEmpty
    private String companyName;

    @NotEmpty
    private String employerName;

    @Enumerated(EnumType.STRING)
    private JobType jobType;

    private LocalDate appliedDate;
}
