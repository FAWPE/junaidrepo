package com.assignment.UniversityEventManagement.Controller;

import com.assignment.UniversityEventManagement.Model.Department;
import com.assignment.UniversityEventManagement.Model.Student;
import com.assignment.UniversityEventManagement.Service.StudentService;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class StudentController {

    @Autowired
    StudentService studentService;

//    Add student
      @PostMapping("student")
    public String addStudent(@RequestBody Student student){
          return studentService.addStudent(student);
      }

   // update student department
    @PutMapping("department/id/{studentId}")
    public String updateDepartment(@PathVariable Integer studentId, @RequestParam  Department department){
          return studentService.updateDepartment(studentId,department);
    }

//    delete student
    @DeleteMapping("student/id/{studentId}")
    public String deleteStudent(@PathVariable Integer studentId){
          return studentService.deleteStudent(studentId);
    }

//    Get all students
    @GetMapping("students")
    public List<Student> getAllStudents(){
          return studentService.getAllStudents();
    }

//    Get student by Id
    @GetMapping("student/id/{studentId}")
        public Student getStudent(@PathVariable Integer studentId){
          return studentService.getStudent(studentId);
    }

}
