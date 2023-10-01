package com.assignment.eCommerce.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AddressModel {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Integer id;
   @NotEmpty
   String  name ;
   @NotBlank
   String  landmark;
   @Size(min = 10,max = 13)
   String  phoneNumber;
   @NotNull
   String  zipcode;
   @NotBlank
   String  state;
   @OneToMany
   @JoinColumn(name = "fk_address")
   List<UserModel> userId;
}
