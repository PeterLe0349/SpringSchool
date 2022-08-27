package com.example.springschool.controllers;

import com.example.springschool.repositories.SubjectRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubjectController {

    private SubjectRepository subjectDao;

    public SubjectController(SubjectRepository subjectDao) {
        this.subjectDao = subjectDao;
    }

    @GetMapping("/subjects")
    public String showSubjects(Model model){
        model.addAttribute("subjects", subjectDao.findAll());
        return "/subject/index";
    }
}
