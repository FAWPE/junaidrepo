package com.assignment.empadd.Repo;

import com.assignment.empadd.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface IAddressRepo extends JpaRepository<Address, Long> {
    @Modifying
    @Query(value = "UPDATE ADDRESS SET zip_code =(:zipCode) WHERE add_id =(:addId)",nativeQuery = true)
    void updateZipCodeById(String zipCode, Long addId);
}
