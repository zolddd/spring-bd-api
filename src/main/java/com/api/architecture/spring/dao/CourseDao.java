package com.api.architecture.spring.dao;
import com.api.architecture.spring.model.CourseModel;


import java.util.List;

public interface CourseDao {
    List<CourseModel> getAllCourses();
    CourseModel getCourse(long id);
    CourseModel registerCourse(CourseModel courseModel);
    CourseModel updateCourse(long id,CourseModel courseModel);
    void deleteCourse(long id);
}
