package com.assignment.studentcourse.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,scope = Laptop.class,property = "laptopId")
public class Laptop {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer laptopId;
   @NotBlank
    private String name;
   @NotBlank
    private String brand;
   @NotNull
    private Integer price;

    @OneToOne
    @JoinColumn(name = "fk_student")
    Student student;
}
