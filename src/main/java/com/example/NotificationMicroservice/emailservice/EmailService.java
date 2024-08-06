package com.example.NotificationMicroservice.emailservice;

import com.example.NotificationMicroservice.dtos.StudentAddedNotificationRequest;

public interface EmailService
{
    String sendEmail(StudentAddedNotificationRequest studentAddedNotificationRequest);
}
