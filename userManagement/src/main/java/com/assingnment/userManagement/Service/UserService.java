package com.assingnment.userManagement.Service;

import com.assingnment.userManagement.Model.Userent;
import com.assingnment.userManagement.repo.IRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    IRepo iRepo;
    public String addUser(Userent user) {
        iRepo.save(user);
        return "Userent added succeccfully...!";
    }

    public Userent getUserById(Integer userId) {
        Userent user = iRepo.findById(userId).orElse(null);
        if(user!=null){
            return user;
        }
        return new Userent();
    }

    public List<Userent> getAllUsers() {
        return (List<Userent>) iRepo.findAll();
    }

    public String updateUser(Integer userId,String phoneNumber) {
        Userent user = iRepo.findById(userId).orElse(null);
        if(user!=null){
            user.setPhoneNumber(phoneNumber);
            iRepo.save(user);
            return "Updated Successfully...!";
        }
        return "Userent Not Found";
    }

    public String deleteUser(Integer userId) {
        iRepo.deleteById(userId);
        return "deleted successfully.....!";
    }
}
