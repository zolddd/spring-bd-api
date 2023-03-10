package com.api.architecture.spring.service;
import com.api.architecture.spring.dao.StudentDao;
import com.api.architecture.spring.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@CrossOrigin
@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;

    public List<StudentModel> getAll(){return studentDao.getAllStudents();}

    public StudentModel get(long id){
        return studentDao.getStudent(id);
    }
    public StudentModel register(StudentModel studentModel){
        return studentDao.registerStudent(studentModel);
    }

    public StudentModel update(@PathVariable long id,@RequestBody StudentModel studentModel){
        return studentDao.updateStudent(id,studentModel);
    }
    public void delete(@PathVariable long id){
         studentDao.deleteStudent(id);
    }
    public StudentModel getStudentByEmail(String email){
        return studentDao.getStudentByEmail(email);
    }

}
