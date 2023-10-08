package com.assignment.studentcourse.repo;

import com.assignment.studentcourse.model.Laptop;
import com.assignment.studentcourse.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRepo extends JpaRepository<Laptop,Integer> {

    Laptop findByStudent(Student student);
}
