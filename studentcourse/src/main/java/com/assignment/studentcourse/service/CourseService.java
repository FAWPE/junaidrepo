package com.assignment.studentcourse.service;

import com.assignment.studentcourse.model.Course;
import com.assignment.studentcourse.repo.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    ICourseRepo courseRepo;
    public String addCourse(Course course) {
        courseRepo.save(course);
        return "course added";
    }

    public Course getCourse(Integer courseId) {
        return courseRepo.findById(courseId).orElseThrow();
    }

    public String deleteCourse(Integer courseId) {
        courseRepo.deleteById(courseId);
        return "deleted";
    }

    public String updateDuration(Integer courseId, String duration) {
        Course course = courseRepo.findById(courseId).orElseThrow();
        course.setDuration(duration);
        courseRepo.save(course);
        return "duration updated";
    }
}
