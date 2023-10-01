package com.assignment.eCommerce.Repo;

import com.assignment.eCommerce.Model.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<AddressModel,Integer> {
}
