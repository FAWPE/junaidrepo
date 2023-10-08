package com.assignment.studentcourse.service;

import com.assignment.studentcourse.model.Student;
import com.assignment.studentcourse.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;

    public String addStudent(Student student) {
        studentRepo.save(student);
        return "student added";
    }

    public String updateStudent(String phoneNumber, Integer studentId) {

       Student student = studentRepo.findById(studentId).orElseThrow();
       student.setPhoneNumber(phoneNumber);
       studentRepo.save(student);
       return "updated";
    }

    public Student getStudent(Integer studentId) {
        return studentRepo.findById(studentId).orElseThrow();
    }

    public String deleteStudent(Integer studentId) {
        studentRepo.deleteById(studentId);
        return "deleted";
    }
}
