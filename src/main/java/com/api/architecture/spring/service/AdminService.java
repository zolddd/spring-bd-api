package com.api.architecture.spring.service;
import com.api.architecture.spring.dao.AdminDao;
import com.api.architecture.spring.model.AdminModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@CrossOrigin
@Service
public class AdminService {
    @Autowired
    AdminDao adminDao;

    public List<AdminModel> getAll(){return adminDao.getAllAdmins();}

    public AdminModel get(long id){
        return adminDao.getAdmin(id);
    }
    public AdminModel register(AdminModel adminModel){
        return adminDao.registerAdmin(adminModel);
    }

    public AdminModel update(@PathVariable long id, @RequestBody AdminModel adminModel){
        return adminDao.updateAdmin(id,adminModel);
    }
    public void delete(@PathVariable long id){
        adminDao.deleteAdmin(id);
    }


}
