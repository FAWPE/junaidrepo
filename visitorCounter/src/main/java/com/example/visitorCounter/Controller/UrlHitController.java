package com.example.visitorCounter.Controller;

import com.example.visitorCounter.Service.UrlHitService;
import com.example.visitorCounter.entity.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Validated
public class UrlHitController {
    @Autowired
    UrlHitService visitorCounter;


    @GetMapping("api/v1/visitor-count-app/{userName}")
    public Visitor getHitCount(@PathVariable  String userName){

            return visitorCounter.visitorCount(userName);
    }

}
