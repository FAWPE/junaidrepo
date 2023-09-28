package com.assignment.UniversityEventManagement.Repo;

import com.assignment.UniversityEventManagement.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student, Integer> {
}
