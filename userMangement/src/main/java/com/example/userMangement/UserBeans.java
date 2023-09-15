package com.example.userMangement;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
@Configuration
public class UserBeans {
    @Bean
    public ArrayList<User> storage(){
        return new ArrayList<>();
    }
}
