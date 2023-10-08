package com.assignment.studentcourse.repo;

import com.assignment.studentcourse.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course,Integer> {
}
