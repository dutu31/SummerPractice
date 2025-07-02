package com.createq.summerpracticetest2.repository;

import com.createq.summerpracticetest2.model.SchoolModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<SchoolModel, Integer> {

}
