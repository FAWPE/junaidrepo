package com.assignment.empadd.Service;

import com.assignment.empadd.Model.Address;
import com.assignment.empadd.Repo.IAddressRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;
    public List<Address> allAddresses() {
        return addressRepo.findAll();
    }

    public Address addById(Long addId) {
       return addressRepo.findById(addId).orElse(new Address());
    }

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "Address saved";
    }
    @Transactional
    public String updateAddress(String zipCode, Long addId) {
        addressRepo.updateZipCodeById(zipCode, addId);
        return "Updated Successfully";
    }

    public String deleteAddressById(Long addId) {
        addressRepo.deleteById(addId);
        return "Deleted successfully..";
    }
}
