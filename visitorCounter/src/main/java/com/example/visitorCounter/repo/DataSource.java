package com.example.visitorCounter.repo;

import com.example.visitorCounter.entity.Visitor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
@Configuration
public class DataSource {
    @Bean
   HashMap<String, Visitor> userMap(){
       return new HashMap<>();
   }
}
