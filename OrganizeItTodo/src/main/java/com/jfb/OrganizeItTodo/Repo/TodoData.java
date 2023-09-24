package com.jfb.OrganizeItTodo.Repo;

import com.jfb.OrganizeItTodo.Entity.Todo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class TodoData {
    @Bean
    public List<Todo> dataSource(){
        return  new ArrayList<>();
    }
}
