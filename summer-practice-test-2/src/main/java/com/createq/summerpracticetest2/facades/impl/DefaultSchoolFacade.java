package com.createq.summerpracticetest2.facades.impl;

import com.createq.summerpracticetest2.converter.SchoolConverter;
import com.createq.summerpracticetest2.dto.SchoolDTO;
import com.createq.summerpracticetest2.facades.SchoolFacade;
import com.createq.summerpracticetest2.model.SchoolModel;
import com.createq.summerpracticetest2.service.SchoolService;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DefaultSchoolFacade implements SchoolFacade {
    private final SchoolService schoolService;
    private final SchoolConverter schoolConverter;

    public DefaultSchoolFacade(SchoolService schoolService, SchoolConverter schoolConverter) {
        this.schoolService = schoolService;
        this.schoolConverter = schoolConverter;
    }

    public List<SchoolDTO> getAll() {
        List<SchoolModel>schools= schoolService.getAll();
        return schoolConverter.convertAll(schools);
    }
}
