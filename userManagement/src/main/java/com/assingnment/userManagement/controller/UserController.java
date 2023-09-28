package com.assingnment.userManagement.controller;

import com.assingnment.userManagement.Model.Userent;
import com.assingnment.userManagement.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@Validated
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("user")
    public String addUser( @RequestBody Userent user){
        return userService.addUser(user);
    }

    @GetMapping("user/id/{userId}")
    public Userent getUserById(@PathVariable Integer userId){
        return userService.getUserById(userId);
    }
    @GetMapping("allusers")
    public List<Userent> getAllUsers(){
        return userService.getAllUsers();
    }
    @PutMapping("update/phonenumber/{PhoneNumber}")
    public String udpadeUser(@RequestParam Integer userId, String phoneNumber ){
        return userService.updateUser(userId, phoneNumber);
    }
    @DeleteMapping("delete/id/{UserId}")
    public String deleteUser(@PathVariable Integer userId){
        return userService.deleteUser(userId);
    }
}
