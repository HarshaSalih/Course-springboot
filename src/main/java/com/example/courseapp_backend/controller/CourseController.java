package com.example.courseapp_backend.controller;

import com.example.courseapp_backend.dao.CourseDao;
import com.example.courseapp_backend.model.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CourseController {

    @Autowired
    private CourseDao dao;

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String Addcourse(@RequestBody Courses c)
    {
        System.out.println(c.getCourseTitle().toString());
        System.out.println(c.getCourseDescription().toString());
        System.out.println(c.getCourseVenue().toString());
        System.out.println(c.getCourseDuration().toString());
        System.out.println(c.getCourseDate().toString());

        dao.save(c);
        return "course added successfully";
    }

    @GetMapping("/view")
    public String viewcourse()
    {
        return "course viewed";
    }
}
