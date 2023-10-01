package com.assignment.eCommerce.service;

import com.assignment.eCommerce.Model.UserModel;
import com.assignment.eCommerce.Repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;
    public String addUser(UserModel user) {
        userRepo.save(user);
        return "user added";
    }

    public UserModel getUser(Integer userId) {
        return userRepo.findById(userId).orElse(new UserModel());
    }
}
