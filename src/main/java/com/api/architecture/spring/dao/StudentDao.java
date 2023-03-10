package com.api.architecture.spring.dao;
import com.api.architecture.spring.model.StudentModel;

import java.util.List;

public interface StudentDao {
    List<StudentModel> getAllStudents();
    StudentModel getStudent(long id);
    StudentModel registerStudent(StudentModel studentModel);
    StudentModel updateStudent(long id,StudentModel studentModel);
    void deleteStudent(long id);

    StudentModel getStudentByEmail(String email);
}
