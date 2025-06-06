package com.example.webtest.controller;

import com.example.webtest.repository.LogRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogsController {

    private final LogRepository logRepository;

    public LogsController(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @GetMapping("/logs")
    public String viewLogs(Model model) {
        
        model.addAttribute("logs", logRepository.findAll());
        return "logs";
    }
}
