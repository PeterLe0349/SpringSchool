package com.example.springschool.controllers;

import com.example.springschool.models.Student;
import com.example.springschool.repositories.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private final StudentRepository studentDao;

    public StudentController(StudentRepository studentDao) {
        this.studentDao = studentDao;
    }

    @GetMapping("/students")
    public String showStudents(Model model){
        model.addAttribute("students",studentDao.findAll());
        return "/index";
    }

    @GetMapping("/student/create")
    public String createStudent(Model model){
        model.addAttribute("student", new Student());
        return "/student/create";
    }

    @PostMapping("/student/create")
    public String createStudentSave(@ModelAttribute Student student, Model model){
        studentDao.save(student);
        return "redirect:/students";
    }
}
