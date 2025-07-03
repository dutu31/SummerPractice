package com.createq.summerpracticetest2.controller;

import com.createq.summerpracticetest2.dto.StudentDTO;
import com.createq.summerpracticetest2.facades.StudentFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {
   private final StudentFacade studentFacade;

   @Autowired
    public StudentController(StudentFacade studentFacade) {
        this.studentFacade = studentFacade;
    }
    @GetMapping("/students")
    public String getAll(Model model) {
       List<StudentDTO> students=studentFacade.getAll();
       model.addAttribute("students",students);
       return "";

    }
}
