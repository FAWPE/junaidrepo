package com.assignments.RestaurantsApp.service;

import com.assignments.RestaurantsApp.entity.Restaurant;
import com.assignments.RestaurantsApp.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo repo;
    public Restaurant getRestaurant(Integer restaurantId) {
        return repo.getRestaurant().get(restaurantId);
    }

    public Map<Integer, Restaurant> getAllrestaurants() {
        return repo.getRestaurant();
    }



    public void addRestaurant(Integer restaurantId, Restaurant restaurant) {
        getAllrestaurants().put(restaurantId,restaurant);
    }

    public void updateDetails(Integer restaurantId, String restaurantSpecialty) {
        getRestaurant(restaurantId).setRestaurantSpecialty(restaurantSpecialty);
    }

    public void deleteRestaurant(Integer restaurantId) {
        getAllrestaurants().remove(restaurantId);
    }
}
