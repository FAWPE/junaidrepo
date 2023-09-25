package com.assingnment.userManagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
   private Integer UserId;
    @NotBlank
   private String    username;
    @Pattern(regexp = "^(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])-(19|20)\\d{2}$\n")
   private LocalDate DateOfBirth;
    @Email
    private String   email;
    @Size(min = 12, max = 12)
   private Long PhoneNumber;
    @NotEmpty
   private LocalDateTime dateTime;

}
