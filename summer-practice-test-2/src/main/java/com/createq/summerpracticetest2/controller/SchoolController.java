package com.createq.summerpracticetest2.controller;

import com.createq.summerpracticetest2.dto.SchoolDTO;
import com.createq.summerpracticetest2.facades.SchoolFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SchoolController {

    private final SchoolFacade schoolFacade;

    @Autowired
    public SchoolController(SchoolFacade schoolFacade) {
        this.schoolFacade = schoolFacade;
    }
    @GetMapping("/schools")
    public String getAll(Model model) {
        List<SchoolDTO> schools=schoolFacade.getAll();
        model.addAttribute("schools",schools);
        return "";
    }
}
