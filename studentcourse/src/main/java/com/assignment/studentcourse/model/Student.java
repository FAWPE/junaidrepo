package com.assignment.studentcourse.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=Student.class,property="studentId")
public class Student {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
   @NotBlank
    private String name;
   @NotNull
   @Min(16)
    private Integer age;
   @Size(min = 10, max = 13)
    private String phoneNumber;
   @NotBlank
    private String branch;
   @Enumerated(value = EnumType.STRING)
    private Department department;

    @ManyToOne
    @JoinColumn(name = "fk_address")
    private Address address;

    @ManyToMany
    @JoinTable(name = "studentcourse", joinColumns = @JoinColumn(name = "fk_course"),inverseJoinColumns = @JoinColumn(name = "fk_student"))
    Set<Course> courseSet;

}
