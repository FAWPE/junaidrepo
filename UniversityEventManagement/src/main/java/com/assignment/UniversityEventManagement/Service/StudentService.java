package com.assignment.UniversityEventManagement.Service;

import com.assignment.UniversityEventManagement.Model.Department;
import com.assignment.UniversityEventManagement.Model.Student;
import com.assignment.UniversityEventManagement.Repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;

    public String addStudent(Student student) {
        studentRepo.save(student);
        return "student added Successfully...!";
    }

    public String updateDepartment(Integer studentId,Department department) {
        Student student = studentRepo.findById(studentId).orElse(null);
        if(student!=null){
            student.setDepartment(department);
            studentRepo.save(student);
            return "Student Department updated";
        }else{
            return "Student not found";
        }

    }

    public String deleteStudent(Integer studentId) {
        studentRepo.deleteById(studentId);
        return "Student deleted Successfully";
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student getStudent(Integer studentId) {
        return studentRepo.findById(studentId).orElse(null);
    }
}
