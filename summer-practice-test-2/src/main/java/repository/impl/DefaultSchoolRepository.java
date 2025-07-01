package repository.impl;

import model.SchoolModel;
import model.StudentModel;
import repository.SchoolRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DefaultSchoolRepository implements SchoolRepository {
    @Override
    public List<SchoolModel> getAll() {

        StudentModel s1=new StudentModel();
        s1.setId(1);
        s1.setName("Maria");
        s1.setAge(19);

        StudentModel s2=new StudentModel();
        s2.setId(2);
        s2.setName("Marian");
        s2.setAge(24);

        StudentModel s3=new StudentModel();
        s3.setId(3);
        s3.setName("Matei");
        s3.setAge(25);

        StudentModel s4=new StudentModel();
        s4.setId(4);
        s4.setName("Ioan");
        s4.setAge(21);

        List<SchoolModel> schools=new ArrayList<>();
        SchoolModel sc1=new SchoolModel();
        sc1.setId(1);
        sc1.setName("Colegiul National");
        sc1.setStudents(Arrays.asList(s1,s2));

        SchoolModel sc2=new SchoolModel();
        sc2.setId(2);
        sc2.setName("Colegiul National Emil Racovita");
        sc2.setStudents(Arrays.asList(s3,s4));
        return schools;
    }
}
