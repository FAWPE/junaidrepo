package com.assignment.studentcourse.controller;

import com.assignment.studentcourse.model.Address;
import com.assignment.studentcourse.service.AddressService;
import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }
    @GetMapping("address/id/{addressId}")
    public Address getAddress(@PathVariable Long addressId){
        return addressService.getAddress(addressId);
    }
}
