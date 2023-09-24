package com.jfb.OrganizeItTodo.Repo;

import com.jfb.OrganizeItTodo.Entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public class TodoRepo {
    @Autowired
  private List<Todo> list;
    public List<Todo> list(){
        return list;
    }
}
