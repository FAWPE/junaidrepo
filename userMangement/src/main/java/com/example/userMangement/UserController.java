package com.example.userMangement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {
    @Autowired
   ArrayList<User> userList;///this is used for storage

   @PostMapping("addUser")
   public String addUser(@RequestBody User user){
       userList.add(user);
       return "user added";
   }


    @GetMapping("getUser/{userid}")
  public User getUser(@PathVariable Integer userid){
       User u=null;


       for(User user: userList){
           if(user.getUserId().equals(userid)){
               u=user;
               break;
           }
       }
    return u;
    }

    @GetMapping("getAllUser")
     public ArrayList<User> getAllUser(){
       return userList;
     }

     @PutMapping("updateUserInfo/{UserId}")
     public String  updateUserInfo(@PathVariable Integer UserId, @RequestBody User userr){
       for(int i=0;i<userList.size();i++){
           User user= userList.get(i);
           if(user.getUserId().equals(UserId)){
              userList.set(i,userr);
               return "Updated Successfully...!";
           }
       }
       return " Userid Not valid";
          }

          @DeleteMapping("deleteUser")
   public String deleteUser(@RequestParam Integer userId){
      for(User user: userList) {
          if(user.getUserId().equals(userId)) {
              userList.remove(user);
              return "user Deleted Successfully";
          }
      }
      return "user not found";
   }

}
