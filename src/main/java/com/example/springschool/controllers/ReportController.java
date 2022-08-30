package com.example.springschool.controllers;

import com.example.springschool.repositories.ReportRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReportController {

    private ReportRepository reportDao;

    public ReportController(ReportRepository reportDao) {
        this.reportDao = reportDao;
    }

    @GetMapping("/reports")
    public String getReports(Model model){
        model.addAttribute("reports", reportDao.findAll());
        return "/report/index";
    }
}
