package com.assignment.UniversityEventManagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id
   private Integer  studentId;

    @Pattern(regexp = "^[A-Z][a-z]*$")
    private String firstName;

    @NotNull
   private String  lastName;

    @Min(18)@Max((25))
    private Integer age;

    private Department department;
}
