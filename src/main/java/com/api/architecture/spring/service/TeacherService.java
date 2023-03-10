package com.api.architecture.spring.service;
import com.api.architecture.spring.dao.TeacherDao;
import com.api.architecture.spring.model.TeacherModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
@CrossOrigin
public class TeacherService {
    @Autowired
    TeacherDao teacherDao;

    public List<TeacherModel> getAll(){
        return teacherDao.getAllTeachers();
    }

    public TeacherModel get(Long id){
        return teacherDao.getTeacher(id);
    }

    public TeacherModel register(TeacherModel teacherModel){
        return teacherDao.registerTeacher(teacherModel);
    }
    public TeacherModel update(@RequestBody TeacherModel teacherModel){
        return teacherDao.updateTeacher(teacherModel);
    }
    public void delete(@PathVariable long id){
        teacherDao.deleteTeacher(id);
    }
}
