package com.example.springschool.controllers;

import com.example.springschool.repositories.CommentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommentController {

    private final CommentRepository commentDao;

    public CommentController(CommentRepository commentDao) {
        this.commentDao = commentDao;
    }

    @GetMapping("/comments")
    public String showComments(Model model){
        return "/comment/index";
    }


}
