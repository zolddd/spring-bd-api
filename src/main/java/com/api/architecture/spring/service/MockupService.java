package com.api.architecture.spring.service;
import com.api.architecture.spring.dao.MockupDao;
import com.api.architecture.spring.model.MockupModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@CrossOrigin
@Service
public class MockupService {
    @Autowired
    MockupDao mockupDao;

    public List<MockupModel> getAll(){return mockupDao.getAllMockups();}

    public MockupModel get(long id){
        return mockupDao.getMockup(id);
    }
    public MockupModel register(MockupModel mockupModel){
        return mockupDao.registerMockup(mockupModel);
    }

    public MockupModel update(@PathVariable long id, @RequestBody MockupModel mockupModel){
        return mockupDao.updateMockup(id,mockupModel);
    }
    public void delete(@PathVariable long id){
        mockupDao.deleteMockup(id);
    }
}
