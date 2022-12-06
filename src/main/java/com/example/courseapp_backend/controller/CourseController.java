package com.example.courseapp_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CourseController {

    @PostMapping("/")
    public String Addcourse()
    {
        return "course added";
    }
}
