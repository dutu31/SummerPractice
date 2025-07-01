package repository;

import model.SchoolModel;

import java.util.List;

public interface SchoolRepository {
    List<SchoolModel> getAll();
}
