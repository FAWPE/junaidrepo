package com.assignment.Jobportal.Repo;

import com.assignment.Jobportal.Model.Job;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IRepo extends CrudRepository<Job, Long> {


    Job findByCompanyName(String companyName);
    @Modifying
    @Query(value = "UPDATE JOB SET SALARY = (:salary) WHERE SALARY = (:preSalary)", nativeQuery = true)
    void updateSalary(Double salary, Double preSalary);
}
