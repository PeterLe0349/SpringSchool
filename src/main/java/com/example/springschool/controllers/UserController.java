package com.example.springschool.controllers;

import com.example.springschool.repositories.UserRepository;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserRepository userDao;

    public UserController(UserRepository userDao) {
        this.userDao = userDao;
    }
}
