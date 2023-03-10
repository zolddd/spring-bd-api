package com.api.architecture.spring.controller;
import com.api.architecture.spring.model.MockupModel;
import com.api.architecture.spring.service.MockupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/mockup")
public class MockupController {

    @Autowired
    MockupService mockupService;

    @GetMapping("/getAll")
    List<MockupModel> getAllMockups(){
        return mockupService.getAll();
    }
    @GetMapping(value = "/getID/{id}")
    MockupModel getMockupById(@PathVariable("id") Long id){
        return mockupService.get(id);
    }
    @PostMapping(value = "/create")
    MockupModel createMockup(@RequestBody MockupModel mockupModel){
        return mockupService.register(mockupModel);
    }
    @PutMapping(value="/update/{id}")
    MockupModel updateMockupByID(@PathVariable("id") Long id,@RequestBody MockupModel mockupModel){
        return mockupService.update(id,mockupModel);
    }
    @DeleteMapping(value = "/delete/{id}")
    void deleteCourse(@PathVariable("id") Long id){
        mockupService.delete(id);
    }


}
