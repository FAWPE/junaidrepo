package com.jfb.OrganizeItTodo.Service;

import com.jfb.OrganizeItTodo.Entity.Todo;
import com.jfb.OrganizeItTodo.Repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    TodoRepo repo;
    public String addTask(Todo todo) {
        repo.list().add(todo);
        return "Task Added Successfully...!";
    }

    public Todo getTodoById(Integer id) {
       List<Todo> todos = repo.list();
       Todo todoget=null;
       for(Todo todo: todos){
           if(todo.getId().equals(id)){
              todoget=todo;
              break;
           }
       }
       return todoget;
    }

    public String updateStatus(Integer id,boolean status) {
        List<Todo> listtodo= repo.list();
        for(Todo todo:listtodo){
            if(todo.getId().equals(id)){
                todo.setStatus(status);
                return " Status updated to "+status;
            }
        }
        return "Status not updated";
    }

    public List<Todo> getAllTodo() {
        return repo.list();
    }

    public String deleteTodo(Integer id) {
        List<Todo> alltodo=getAllTodo();
        for (Todo todo:alltodo) {
            if(todo.getId().equals(id)){
                alltodo.remove(todo);
                return id+" Deleted Successfully";
            }
        }
        return "Invalid task ID "+id;
    }
}
