package com.example.springschool.controllers;

import com.example.springschool.repositories.CommentRepository;
import org.springframework.stereotype.Controller;

@Controller
public class CommentController {

    private final CommentRepository commentDao;

    public CommentController(CommentRepository commentDao) {
        this.commentDao = commentDao;
    }


}
