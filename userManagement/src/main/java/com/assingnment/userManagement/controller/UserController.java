package com.assingnment.userManagement.controller;

import com.assingnment.userManagement.Model.User;
import com.assingnment.userManagement.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("user")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("user/id/{UserId}")
    public User getUserById(@PathVariable Integer UserId){
        return userService.getUserById(UserId);
    }
    @GetMapping("allusers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @PutMapping("update/phonenumber/{PhoneNumber}")
    public String udpadeUser(@RequestParam Integer UserId, Long PhoneNumber ){
        return userService.updateUser(UserId, PhoneNumber);
    }
    @DeleteMapping("delete/id/{UserId}")
    public String deleteUser(@PathVariable Integer UserId){
        return userService.deleteUser(UserId);
    }
}
