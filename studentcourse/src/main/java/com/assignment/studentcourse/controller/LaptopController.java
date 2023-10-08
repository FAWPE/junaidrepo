package com.assignment.studentcourse.controller;

import com.assignment.studentcourse.model.Laptop;
import com.assignment.studentcourse.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
public class LaptopController {

    @Autowired
    LaptopService laptopService;
    @PostMapping("laptop")
    public String addLap(@RequestBody Laptop laptop){
        return laptopService.addLap(laptop);
    }

    @GetMapping("lap/student/")
    public Laptop getLap(@RequestParam Integer studentId){
        return laptopService.getLap(studentId);
    }



}
