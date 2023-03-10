package com.api.architecture.spring.controller;
import com.api.architecture.spring.service.StudentService;
import com.api.architecture.spring.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/getAll")
    List<StudentModel> getAllStudents(){
        return studentService.getAll();

    }
    @GetMapping(value = "/getID/{id}")
    StudentModel getStudentById(@PathVariable("id") Long id){
        return studentService.get(id);
    }
    @PostMapping(value = "/create")
    StudentModel createStudent(@RequestBody StudentModel studentModel){
        return studentService.register(studentModel);
    }
    @PutMapping(value="/update/{id}")
    StudentModel updateStudentByID(@PathVariable("id") Long id,@RequestBody StudentModel studentModel){
        return studentService.update(id,studentModel);
    }
    @DeleteMapping(value = "/delete/{id}")
    void deleteStudentById(@PathVariable("id") long id){
        studentService.delete(id);
    }

}
