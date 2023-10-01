package com.assignment.eCommerce.controller;

import com.assignment.eCommerce.Model.UserModel;
import com.assignment.eCommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;
     @PostMapping("user")
    public String addUser(@RequestBody UserModel user){
         return userService.addUser(user);
     }
     @GetMapping("user/id/{userId}")
    public UserModel getUser(@PathVariable Integer userId){
         return userService.getUser(userId);
     }

}
