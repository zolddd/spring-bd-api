package com.api.architecture.spring.dao;

import com.api.architecture.spring.model.MockupModel;

import java.util.List;

public interface MockupDao {
    List<MockupModel> getAllMockups();
    MockupModel getMockup(long id);
    MockupModel registerMockup(MockupModel mockupModel);
    MockupModel updateMockup(long id,MockupModel mockupModel);
    void deleteMockup(long id);
}
