package com.example.springschool.controllers;

import com.example.springschool.repositories.SubjectRepository;
import org.springframework.stereotype.Controller;

@Controller
public class SubjectController {

    private SubjectRepository subjectDao;

    public SubjectController(SubjectRepository subjectDao) {
        this.subjectDao = subjectDao;
    }
}
