package com.example.courseapp_backend.dao;

import com.example.courseapp_backend.model.Courses;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseDao extends CrudRepository<Courses,Integer> {

    @Query(value = "SELECT `id`, `course_date`, `course_description`, `course_duration`, `course_title`, `course_venue` FROM `courses` WHERE `course_title` LIKE %:course_title%",nativeQuery = true)
    List<Courses> SearchCourse(@Param("course_title")String course_title);
}
