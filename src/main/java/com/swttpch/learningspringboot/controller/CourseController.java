package com.swttpch.learningspringboot.controller;

import com.swttpch.learningspringboot.entity.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "in28Minutes"),
                new Course(2, "Learn DevOps", "in28Minutes"),
                new Course(3, "Learn Azure", "in28Minutes"),
                new Course(4, "Learn NodeJS", "in28Minutes")
        );
    }
}
