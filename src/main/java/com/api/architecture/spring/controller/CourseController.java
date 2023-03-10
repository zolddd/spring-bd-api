package com.api.architecture.spring.controller;
import com.api.architecture.spring.service.CourseService;
import com.api.architecture.spring.model.CourseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("/getAll")
    List<CourseModel> getAllCourses(){
        return courseService.getAll();
    }
    @GetMapping(value = "/getID/{id}")
    CourseModel getCourseById(@PathVariable("id") Long id){
        return courseService.get(id);
    }
    @PostMapping(value = "/create")
    CourseModel createCourse(@RequestBody CourseModel courseModel){
        return courseService.register(courseModel);
    }
    @PutMapping(value="/update/{id}")
    CourseModel updateCourseByID(@PathVariable("id") Long id,@RequestBody CourseModel courseModel){
        return courseService.update(id,courseModel);
    }
    @DeleteMapping(value = "/delete/{id}")
    void deleteCourse(@PathVariable("id") Long id){
        courseService.delete(id);
    }
}
