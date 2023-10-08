package com.assignment.studentcourse.service;

import com.assignment.studentcourse.model.Laptop;
import com.assignment.studentcourse.model.Student;
import com.assignment.studentcourse.repo.ILaptopRepo;
import com.assignment.studentcourse.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    ILaptopRepo laptopRepo;

    @Autowired
    IStudentRepo studentRepo;

    public String addLap(Laptop laptop) {
        laptopRepo.save(laptop);
        return "laptop added";
    }

    public Laptop getLap(Integer studentId) {
        Student student = studentRepo.findById(studentId).orElseThrow();
       return laptopRepo.findByStudent(student);
    }
}
