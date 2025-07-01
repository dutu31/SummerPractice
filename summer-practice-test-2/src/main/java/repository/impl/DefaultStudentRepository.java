package repository.impl;

import model.StudentModel;
import org.springframework.stereotype.Repository;
import repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class DefaultStudentRepository implements StudentRepository {

    @Override
    public List<StudentModel> getAll() {
        List<StudentModel> students=new ArrayList<>();
        StudentModel s1=new StudentModel();
        s1.setId(1);
        s1.setName("Clara");
        s1.setAge(18);

        StudentModel s2=new StudentModel();
        s2.setId(2);
        s2.setName("Andrei");
        s2.setAge(24);

        StudentModel s3=new StudentModel();
        s3.setId(3);
        s3.setName("Matei");
        s3.setAge(25);

        return students;
    }
}
