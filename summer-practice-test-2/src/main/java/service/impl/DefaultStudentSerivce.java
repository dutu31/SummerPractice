package service.impl;

import model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.StudentRepository;
import repository.impl.DefaultStudentRepository;
import service.StudentService;

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
        return studentRepository.getAll();
    }
}
