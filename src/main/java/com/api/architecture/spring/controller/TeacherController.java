package com.api.architecture.spring.controller;
import com.api.architecture.spring.service.TeacherService;
import com.api.architecture.spring.model.TeacherModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/teachers")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @GetMapping("/getAll")
    List<TeacherModel> getAllTeachers(){
        return teacherService.getAll();

    }
    @GetMapping(value = "/getID/{id}")
    TeacherModel getTeacher(@PathVariable("id") Long id){
        return teacherService.get(id);

    }
    @PostMapping(value = "/create")
    TeacherModel createStudent(@RequestBody TeacherModel teacherModel){
        return teacherService.register(teacherModel);

    }
    @PutMapping(value="/update/{id}")
    TeacherModel updateStudentByID(@RequestBody TeacherModel teacherModel){
        return teacherService.update(teacherModel);
    }

}
