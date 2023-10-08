package com.assignment.studentcourse.service;

import com.assignment.studentcourse.model.Address;
import com.assignment.studentcourse.repo.IAdressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAdressRepo adressRepo;
    public String addAddress(Address address) {
        adressRepo.save(address);
        return "added";
    }

    public Address getAddress(Long addressId) {
       return adressRepo.findById(addressId).orElseThrow();
    }
}
