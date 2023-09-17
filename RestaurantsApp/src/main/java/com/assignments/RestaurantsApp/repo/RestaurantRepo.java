package com.assignments.RestaurantsApp.repo;

import com.assignments.RestaurantsApp.entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Repository
public class RestaurantRepo {
    @Autowired
   private  Map<Integer,Restaurant> data;

    public Map<Integer, Restaurant> getRestaurant() {
        return data;
    }
}
