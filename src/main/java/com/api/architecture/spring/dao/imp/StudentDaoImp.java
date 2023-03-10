package com.api.architecture.spring.dao.imp;
import com.api.architecture.spring.dao.StudentDao;
import com.api.architecture.spring.model.StudentModel;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class StudentDaoImp implements StudentDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<StudentModel> getAllStudents() {
        String hql="FROM StudentModel as u";
        return (List<StudentModel>) entityManager.createQuery(hql).getResultList();

    }

    @Transactional
    @Override
    public StudentModel getStudent(long id) {

        return entityManager.find(StudentModel.class,id);
    }

    @Transactional
    @Override
    public StudentModel registerStudent(StudentModel studentModel) {
        entityManager.merge(studentModel);
        return studentModel;
    }

    @Transactional
    @Override
    public StudentModel updateStudent(long id,StudentModel studentModel) {
        StudentModel studentBusqueda=getStudent(id);
        studentBusqueda.setName(studentModel.getName());
        studentBusqueda.setPassword(studentModel.getPassword());
        studentBusqueda.setLastName(studentModel.getLastName());

        entityManager.merge(studentBusqueda);
        return studentBusqueda;
    }

    @Transactional
    @Override
    public void deleteStudent(long id) {
        StudentModel studentModel=getStudent(id);
        entityManager.remove(studentModel);

    }
    @Transactional
    @Override
    public StudentModel getStudentByEmail(String email){
        return entityManager.find(StudentModel.class,email);
    }
}
