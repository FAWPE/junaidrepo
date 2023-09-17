package com.example.visitorCounter.repo;

import com.example.visitorCounter.entity.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
public class VisitorRepo {

    @Autowired
     private HashMap<String, Visitor> userCount;

public HashMap<String, Visitor> getMap(){
    return userCount;
}
}
