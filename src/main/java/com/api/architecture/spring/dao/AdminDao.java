package com.api.architecture.spring.dao;
import com.api.architecture.spring.model.AdminModel;

import java.util.List;

public interface AdminDao {
    List<AdminModel> getAllAdmins();
    AdminModel getAdmin(long id);
    AdminModel registerAdmin(AdminModel adminModel);
    AdminModel updateAdmin(long id,AdminModel adminModel);
    void deleteAdmin(long id);
}
