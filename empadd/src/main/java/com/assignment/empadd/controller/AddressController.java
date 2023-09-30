package com.assignment.empadd.controller;

import com.assignment.empadd.Model.Address;
import com.assignment.empadd.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Validated
public class AddressController {
    @Autowired
    AddressService addressService;
//    GET /addresses - get all addresses
    @GetMapping("addresses")
    public List<Address> allAddresses(){
        return addressService.allAddresses();
    }

//    GET /addresses/{id} - get an address by id
    @GetMapping("address/id/{addId}")
    public Address addById(@PathVariable Long addId){
        return addressService.addById(addId);
    }
//    POST /addresses - create a new address
    @PostMapping("address")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }
//    PUT /addresses/{id} - update an address by id
    @PutMapping("Address/zipcode/{zipCode}")
    public String updateAddress(@PathVariable String zipCode, @RequestParam Long addId){
        return addressService.updateAddress(zipCode,addId);
    }
//    DELETE /addresses/{id} - delete an address by id
    @DeleteMapping("address/id{addId}")
    public String deleteAddressById(@PathVariable Long addId){
        return addressService.deleteAddressById(addId);
    }


}
