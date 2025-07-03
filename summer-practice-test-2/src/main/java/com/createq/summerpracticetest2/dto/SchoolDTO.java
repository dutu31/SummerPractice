package com.createq.summerpracticetest2.dto;

import java.util.List;

public class SchoolDTO {
    private int id;
    private String name;
    private List<StudentDTO>students;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setStudents(List<StudentDTO> students) {
        this.students = students;
    }
    public List<StudentDTO> getStudents() {
        return students;
    }
}
