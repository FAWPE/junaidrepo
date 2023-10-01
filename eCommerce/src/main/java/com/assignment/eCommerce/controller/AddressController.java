package com.assignment.eCommerce.controller;

import com.assignment.eCommerce.Model.AddressModel;
import com.assignment.eCommerce.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class AddressController {

    @Autowired
    AddressService addressService;
    @PostMapping("address")
    public String addAddress(@RequestBody AddressModel address){
        return addressService.addAddress(address);
    }
}
