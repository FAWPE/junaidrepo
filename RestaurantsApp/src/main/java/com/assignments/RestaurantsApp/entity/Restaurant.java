package com.assignments.RestaurantsApp.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Restaurant {
    @NotNull
    private Integer restaurantId;
    @NotBlank
    private String restaurantName;
    @NotBlank
    private String restaurantAddress;
    @Size(min=10,max=13)
    @Pattern(regexp = "^[0-9]$")
    private String restaurantNumber;
    @NotBlank
    private String restaurantSpecialty;
    @NotNull
    private Integer totalStaffs;

    private Category restaurantCategory;
    @NotNull
    private double rating;
}
