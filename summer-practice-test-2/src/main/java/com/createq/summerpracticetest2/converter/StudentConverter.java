package com.createq.summerpracticetest2.converter;

import com.createq.summerpracticetest2.dto.SchoolDTO;
import com.createq.summerpracticetest2.dto.StudentDTO;
import com.createq.summerpracticetest2.model.StudentModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentConverter {
   public StudentDTO convert(StudentModel studentModel) {
        StudentDTO dto=new StudentDTO();
        dto.setId(studentModel.getId());
        dto.setName(studentModel.getName());
        return dto;
    }
   public List<StudentDTO>convertAll(List<StudentModel>studentModels) {
        return studentModels.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }
}
