package com.createq.summerpracticetest2.service.impl;

import com.createq.summerpracticetest2.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.createq.summerpracticetest2.repository.StudentRepository;
import com.createq.summerpracticetest2.service.StudentService;

import java.util.List;
@Service
public class DefaultStudentSerivce implements StudentService {

    private final StudentRepository studentRepository;
    @Autowired
    public DefaultStudentSerivce(StudentRepository studentRepository) {
        this.studentRepository =studentRepository;
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    @Override
    public List<StudentModel> getAll() {
        return studentRepository.findAll();
    }
}
