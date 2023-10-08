package com.assignment.studentcourse.controller;

import com.assignment.studentcourse.model.Student;
import com.assignment.studentcourse.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @PutMapping("student/id/phoneNumber/{phoneNumber}")
    public String updateStudent(@PathVariable String phoneNumber, @RequestParam Integer studentId){
        return studentService.updateStudent(phoneNumber,studentId);
    }
    @GetMapping("student/id/{studentId}")
    public Student getStudent(@PathVariable Integer studentId){
        return studentService.getStudent(studentId);
    }
    @DeleteMapping("student")
    public String deleteStudent(@RequestParam Integer studentId){
        return studentService.deleteStudent(studentId);
    }
}
