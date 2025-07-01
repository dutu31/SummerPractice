package service.impl;

import model.SchoolModel;
import repository.SchoolRepository;
import repository.impl.DefaultSchoolRepository;
import service.SchoolService;

import java.util.List;

public class DefaultSchoolService implements SchoolService {

    private final SchoolRepository schoolRepository;

    public DefaultSchoolService() {
        this.schoolRepository =new DefaultSchoolRepository();
    }

    public SchoolRepository getSchoolRepository() {
        return schoolRepository;
    }

    @Override
    public List<SchoolModel> getAll() {
        return schoolRepository.getAll();
    }
}
