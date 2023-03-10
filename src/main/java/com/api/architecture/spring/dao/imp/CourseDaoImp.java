package com.api.architecture.spring.dao.imp;
import com.api.architecture.spring.dao.CourseDao;
import com.api.architecture.spring.model.CourseModel;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CourseDaoImp implements CourseDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<CourseModel> getAllCourses() {
        String hql="FROM CourseModel as u";
        return (List<CourseModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public CourseModel getCourse(long id) {
        return entityManager.find(CourseModel.class, id);
    }
    @Transactional
    @Override
    public CourseModel registerCourse(CourseModel courseModel) {
        entityManager.merge(courseModel);
        return courseModel;
    }
    @Transactional

    public CourseModel updateCourse(long id,CourseModel courseModel) {
        CourseModel courseBusqueda=getCourse(id);
        courseBusqueda.setTitle(courseModel.getTitle());
        courseBusqueda.setCategory(courseModel.getCategory());
        courseBusqueda.setImage(courseModel.getImage());
        courseBusqueda.setDescription(courseModel.getDescription());
        courseBusqueda.setLevel(courseModel.getLevel());
        courseBusqueda.setVideo(courseModel.getVideo());
        courseBusqueda.setUpdateAt(courseModel.getUpdateAt());

        entityManager.merge(courseBusqueda);
        return courseBusqueda;
    }

    @Transactional
    @Override
    public void deleteCourse(long id) {
        CourseModel courseModel=getCourse(id);
        entityManager.remove(courseModel);
    }
}
