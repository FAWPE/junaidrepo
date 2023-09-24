package com.jfb.OrganizeItTodo.Controller;

import com.jfb.OrganizeItTodo.Entity.Todo;
import com.jfb.OrganizeItTodo.Service.TodoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class TodoController {
    @Autowired
    TodoService service;

    @PostMapping("todo")
    public String addTask(@RequestBody  Todo todo){
        return service.addTask(todo);
    }


    @GetMapping("todo")
    public Todo getTodoById(@RequestParam @Valid Integer id){
        return service.getTodoById(id);
    }


    @PutMapping("statuschange/{id}")
    public String updateStatus(@PathVariable @Valid Integer id, @RequestParam boolean status){
        return service.updateStatus(id,status);
    }


    @GetMapping("alltodo")
    public List<Todo> getAllTodo(){
        return service.getAllTodo();
    }

    @DeleteMapping("deletetodo")
    public String deleteTodo(@RequestParam @Valid Integer id){
        return service.deleteTodo(id);
    }

}
