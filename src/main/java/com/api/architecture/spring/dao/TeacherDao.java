package com.api.architecture.spring.dao;
import com.api.architecture.spring.model.TeacherModel;
import java.util.List;

public interface TeacherDao {
    List<TeacherModel> getAllTeachers();
    TeacherModel getTeacher(Long id);
    TeacherModel registerTeacher(TeacherModel teacherModel);
    TeacherModel updateTeacher(TeacherModel teacherModel);
    void deleteTeacher(Long id);

}
