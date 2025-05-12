package com.example.webtest.controller;

import com.example.webtest.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/send-alert")
    public String sendEmailAlert(@RequestParam String recipient,
                                 @RequestParam String subject,
                                 @RequestParam String message) {
        try {
            emailService.sendEmail(recipient, subject, message);
            return "Email has been successfully sent to " + recipient;
        } catch (Exception e) {
            return "Failed to send email: " + e.getMessage();
        }
    }
}
