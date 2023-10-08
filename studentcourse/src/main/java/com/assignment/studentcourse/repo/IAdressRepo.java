package com.assignment.studentcourse.repo;

import com.assignment.studentcourse.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdressRepo extends JpaRepository<Address,Long> {
}
