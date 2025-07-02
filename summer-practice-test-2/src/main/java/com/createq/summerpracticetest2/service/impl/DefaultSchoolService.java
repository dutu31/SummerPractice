package com.createq.summerpracticetest2.service.impl;

import com.createq.summerpracticetest2.model.SchoolModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.createq.summerpracticetest2.repository.SchoolRepository;
import com.createq.summerpracticetest2.service.SchoolService;

import java.util.List;
@Service
public class DefaultSchoolService implements SchoolService {

    private final SchoolRepository schoolRepository;

    @Autowired
    public DefaultSchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository =schoolRepository;
    }

    public SchoolRepository getSchoolRepository() {
        return schoolRepository;
    }

    @Override
    public List<SchoolModel> getAll() {
        return schoolRepository.findAll();
    }
}
