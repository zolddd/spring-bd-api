package com.api.architecture.spring.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.api.architecture.spring.service.AdminService;
import com.api.architecture.spring.model.AdminModel;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/admins")
public class AdminController {
    @Autowired
    AdminService adminService;

    @GetMapping("/getAll")
    List<AdminModel> getAllAdmins(){
        return adminService.getAll();
    }
    @GetMapping(value = "/getID/{id}")
    AdminModel getAdminById(@PathVariable("id") Long id){
        return adminService.get(id);
    }
    @PostMapping(value = "/create")
    AdminModel registerAdmin(@RequestBody AdminModel adminModel){
        return adminService.register(adminModel);
    }
    @PutMapping(value="/update/{id}")
    AdminModel updateAdminByID(@PathVariable("id") Long id,@RequestBody AdminModel adminModel){
        return adminService.update(id,adminModel);
    }
    @DeleteMapping(value = "/delete/{id}")
    void deleteCourse(@PathVariable("id") Long id){
        adminService.delete(id);
    }

}
