package com.createq.summerpracticetest2.converter;

import com.createq.summerpracticetest2.dto.SchoolDTO;
import com.createq.summerpracticetest2.model.SchoolModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SchoolConverter {
    private final StudentConverter studentConverter;

    public SchoolConverter(StudentConverter studentConverter) {
        this.studentConverter = studentConverter;
    }

    public SchoolDTO convert(SchoolModel schoolModel) {
        SchoolDTO dto=new SchoolDTO();
        dto.setId(schoolModel.getId());
        dto.setName(schoolModel.getName());
        dto.setStudents(studentConverter.convertAll(schoolModel.getStudents()));
        return dto;
    }

    public List<SchoolDTO>convertAll(List<SchoolModel> schoolModels) {
        return schoolModels.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }
}
