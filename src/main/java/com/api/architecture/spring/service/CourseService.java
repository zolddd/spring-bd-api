package com.api.architecture.spring.service;
import com.api.architecture.spring.dao.CourseDao;
import com.api.architecture.spring.model.CourseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@CrossOrigin
@Service
public class CourseService {
    @Autowired
    CourseDao courseDao;

    public List<CourseModel> getAll(){return courseDao.getAllCourses();}

    public CourseModel get(long id){
        return courseDao.getCourse(id);
    }
    public CourseModel register(CourseModel courseModel){
        return courseDao.registerCourse(courseModel);
    }

    public CourseModel update(@PathVariable long id,@RequestBody CourseModel courseModel){
        return courseDao.updateCourse(id,courseModel);
    }
    public void delete(@PathVariable long id){
        courseDao.deleteCourse(id);
    }

}
