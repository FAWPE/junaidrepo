package com.assignment.studentcourse.controller;

import com.assignment.studentcourse.model.Course;
import com.assignment.studentcourse.service.CourseService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("course")
    public String addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }
    @GetMapping("course/id/{courseId}")
    public Course getCourse(@PathVariable Integer courseId){
        return courseService.getCourse(courseId);
    }
    @DeleteMapping("course")
    public String deleteCourse(@RequestParam Integer courseId){
        return courseService.deleteCourse(courseId);
    }
    @PutMapping("course/id/{courseId}/duration")
    public String updateDuration(@PathVariable Integer courseId, @RequestBody String duration){
        return courseService.updateDuration(courseId,duration);
    }


}
