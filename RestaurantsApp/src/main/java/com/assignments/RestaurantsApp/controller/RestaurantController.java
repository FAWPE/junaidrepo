package com.assignments.RestaurantsApp.controller;

import com.assignments.RestaurantsApp.entity.Restaurant;
import com.assignments.RestaurantsApp.service.RestaurantService;
import jakarta.validation.Valid;
import lombok.extern.flogger.Flogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Validated
public class RestaurantController {
    @Autowired
    RestaurantService service;

//    get Restaurant by id using GetMapping.
    @GetMapping("restaurant/{restaurantId}")
    public Restaurant getRestaurantById(@PathVariable @Valid Integer restaurantId){
        return service.getRestaurant(restaurantId);
    }
//            -get all Reataurant using  GetMapping
    @GetMapping("allrestaurants")
    public Map<Integer,Restaurant> getAllRestaurants(){
        return service.getAllrestaurants();
    }
//-Add some Restaurant to Restaurant lists using PostMapping
    @PostMapping("restaurantAdd")
    public String addRestaurant(@RequestBody Restaurant restaurant){
       Integer restaurantId=restaurant.getRestaurantId();
        service.addRestaurant(restaurantId,restaurant);
        return "restaurant"+ restaurantId+ " added";
    }
//-update Restaurant information like Specialty.
    @PutMapping("updateDetails/{restaurantSpecialty}")
    public String updateRestaurantDetails(@PathVariable @Valid String restaurantSpecialty, @RequestParam @Valid Integer restaurantId){
        service.updateDetails(restaurantId,restaurantSpecialty);
        return restaurantId +"Restaurant Details updated Successfully...!";
    }
//-delete Restaurant from the list.
    @DeleteMapping("deleteRestaurant/{restaurantId}")
    public String deleteRestaurant(@PathVariable @Valid Integer restaurantId){
        service.deleteRestaurant(restaurantId);
        return restaurantId+" deleted Successfully";
    }

}
