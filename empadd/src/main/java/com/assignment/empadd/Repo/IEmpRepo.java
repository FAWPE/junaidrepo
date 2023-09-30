package com.assignment.empadd.Repo;

import com.assignment.empadd.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpRepo extends JpaRepository<Employee , Long> {
}
