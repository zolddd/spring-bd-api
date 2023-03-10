package com.api.architecture.spring.dao.imp;
import com.api.architecture.spring.dao.TeacherDao;
import com.api.architecture.spring.model.TeacherModel;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@CrossOrigin
@Repository
@Transactional
public class TeacherDaoImp implements TeacherDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<TeacherModel> getAllTeachers() {
        String hql="FROM TeacherModel as u";
        return (List<TeacherModel>) entityManager.createQuery(hql).getResultList();
    }

    @Transactional
    @Override
    public TeacherModel getTeacher(Long id) {
        return entityManager.find(TeacherModel.class, id);
    }

    @Transactional
    @Override
    public TeacherModel registerTeacher(TeacherModel teacherModel) {
        entityManager.merge(teacherModel);
        return teacherModel;
    }
    @Transactional
    @Override
    public TeacherModel updateTeacher(TeacherModel teacherModel) {
        entityManager.merge(teacherModel);
        return teacherModel;
    }

    @Transactional
    @Override
    public void deleteTeacher(Long id) {
        TeacherModel teacherModel=getTeacher(id);
        entityManager.remove(teacherModel);
    };


}
