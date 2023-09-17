package com.assignments.RestaurantsApp.repo;

import com.assignments.RestaurantsApp.entity.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
@Configuration
public class RestaurantData {
    @Bean
    public Map<Integer, Restaurant> getMap() {
       return new HashMap<>();
    }
}
