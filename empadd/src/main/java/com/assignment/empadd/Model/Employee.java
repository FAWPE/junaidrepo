package com.assignment.empadd.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long empId;
    @NotBlank
    String firstName;
    @NotBlank
    String lastName;

    @OneToOne
    @JoinColumn(name = "addressKey")
   Address address;
}
