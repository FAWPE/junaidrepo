package com.assignment.studentcourse.repo;

import com.assignment.studentcourse.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student, Integer> {
}
