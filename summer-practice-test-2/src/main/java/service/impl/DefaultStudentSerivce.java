package service.impl;

import model.StudentModel;
import repository.StudentRepository;
import repository.impl.DefaultStudentRepository;
import service.StudentService;

import java.util.List;

public class DefaultStudentSerivce implements StudentService {

    private final StudentRepository studentRepository;
    public DefaultStudentSerivce() {
        this.studentRepository =new DefaultStudentRepository();
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    @Override
    public List<StudentModel> getAll() {
        return studentRepository.getAll();
    }
}
