package com.assignment.eCommerce.service;

import com.assignment.eCommerce.Model.AddressModel;
import com.assignment.eCommerce.Repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;
    public String addAddress(AddressModel address) {
        addressRepo.save(address);
        return "address added";
    }
}
