package com.assingnment.userManagement.Service;

import com.assingnment.userManagement.Model.User;
import com.assingnment.userManagement.repo.IRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    IRepo iRepo;
    public String addUser(User user) {
        iRepo.save(user);
        return "User added succeccfully...!";
    }

    public User getUserById(Integer userId) {
        User user = iRepo.findById(userId).orElse(null);
        if(user!=null){
            return user;
        }
        return new User();
    }

    public List<User> getAllUsers() {
        return (List<User>) iRepo.findAll();
    }

    public String updateUser(Integer userId,Long phoneNumber) {
        User user = iRepo.findById(userId).orElse(null);
        if(user!=null){
            user.setPhoneNumber(phoneNumber);
            iRepo.save(user);
            return "Updated Successfully...!";
        }
        return "User Not Found";
    }

    public String deleteUser(Integer userId) {
        iRepo.deleteById(userId);
        return "deleted successfully.....!";
    }
}
