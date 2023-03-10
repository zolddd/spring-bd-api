package com.api.architecture.spring.dao.imp;
import org.springframework.stereotype.Repository;
import com.api.architecture.spring.dao.AdminDao;
import com.api.architecture.spring.model.AdminModel;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class AdminDaoImp implements AdminDao {

    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<AdminModel> getAllAdmins() {
        String hql="FROM AdminModel as u";
        return (List<AdminModel>) entityManager.createQuery(hql).getResultList();
    }

    @Transactional
    @Override
    public AdminModel getAdmin(long id) {
        return entityManager.find(AdminModel.class, id);
    }

    @Transactional
    @Override
    public AdminModel registerAdmin(AdminModel adminModel) {
        entityManager.merge(adminModel);
        return adminModel;
    }

    @Transactional
    public AdminModel updateAdmin(long id,AdminModel adminModel) {
        AdminModel adminBusqueda=getAdmin(id);
        adminBusqueda.setEmail(adminModel.getEmail());
        adminBusqueda.setName(adminModel.getName());
        adminBusqueda.setPassword(adminModel.getPassword());
        adminBusqueda.setUpdateAt(adminModel.getUpdateAt());

        entityManager.merge(adminBusqueda);
        return adminBusqueda;
    }

    @Transactional
    @Override
    public void deleteAdmin(long id) {
        AdminModel adminModel=getAdmin(id);
        entityManager.remove(adminModel);

    }

}
