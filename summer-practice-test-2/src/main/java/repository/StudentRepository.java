package repository;

import model.StudentModel;

import java.util.List;

public interface StudentRepository {
    List<StudentModel> getAll();
}
