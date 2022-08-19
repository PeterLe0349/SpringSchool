package com.example.springschool.controllers;

import com.example.springschool.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {


    @GetMapping("/")
    public String welcome(Model model){
        model.addAttribute("message", "TH Message.");
        model.addAttribute("student", new Student("Peter"));
        return "index";
    }
}
