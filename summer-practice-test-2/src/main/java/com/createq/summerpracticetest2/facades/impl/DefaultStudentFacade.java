package com.createq.summerpracticetest2.facades.impl;

import com.createq.summerpracticetest2.converter.StudentConverter;
import com.createq.summerpracticetest2.dto.StudentDTO;
import com.createq.summerpracticetest2.facades.StudentFacade;
import com.createq.summerpracticetest2.model.StudentModel;
import com.createq.summerpracticetest2.service.StudentService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DefaultStudentFacade implements StudentFacade {
    private final StudentService studentService;
    private final StudentConverter studentConverter;

    public DefaultStudentFacade(StudentService studentService, StudentConverter studentConverter) {
        this.studentService = studentService;
        this.studentConverter = studentConverter;
    }

    public List<StudentDTO> getAll() {
        List<StudentModel> students=studentService.getAll();
        return studentConverter.convertAll(students);
    }
}
