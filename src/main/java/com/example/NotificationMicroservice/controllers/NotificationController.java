package com.example.NotificationMicroservice.controllers;

import com.example.NotificationMicroservice.emailservice.AbstractEmailService;
import com.example.NotificationMicroservice.dtos.StudentAddedNotificationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController
{

    @Autowired
    AbstractEmailService emailService;

    @PostMapping("/notify/student-added")
    public ResponseEntity<String> notifyStudentAdded(@RequestBody StudentAddedNotificationRequest studentAddedNotificationRequest)
    {
        String status = emailService.sendEmail(studentAddedNotificationRequest);
        return ResponseEntity.status(202).body(status); //string

    }


}
