package com.api.architecture.spring.dao.imp;
import com.api.architecture.spring.dao.MockupDao;
import org.springframework.stereotype.Repository;
import com.api.architecture.spring.model.MockupModel;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class MockupDaoImp implements MockupDao {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public List<MockupModel> getAllMockups() {
        String hql="FROM MockupModel as u";
        return (List<MockupModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public MockupModel getMockup(long id) {
        return entityManager.find(MockupModel.class, id);
    }
    @Transactional
    @Override
    public MockupModel registerMockup(MockupModel mockupModel) {
        entityManager.merge(mockupModel);
        return mockupModel;
    }
    @Transactional
    @Override
    public MockupModel updateMockup(long id,MockupModel mockupModel) {
        MockupModel mockupModelBusqueda= getMockup(id);

        mockupModelBusqueda.setColorOne(mockupModel.getColorOne());
        entityManager.merge(mockupModelBusqueda);
        return mockupModelBusqueda;
    }

    @Transactional
    @Override
    public void deleteMockup(long id) {
        MockupModel mockupModel = getMockup(id);
        entityManager.remove(mockupModel);
    }
}
