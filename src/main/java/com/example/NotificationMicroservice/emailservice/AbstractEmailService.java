package com.example.NotificationMicroservice.emailservice;

import com.example.NotificationMicroservice.controllers.NotificationController;
import com.example.NotificationMicroservice.dtos.StudentAddedNotificationRequest;

import java.util.logging.Logger;
import java.util.Random;


//gmail, outlook
//dev(gmail) and production(outlook)
//inject the beans based on profile
public abstract class AbstractEmailService implements EmailService
{
    protected static final Logger logger = Logger.getLogger(NotificationController.class.getName());

    protected Random random = new Random();

    protected String emailServiceProvider;

    protected AbstractEmailService(String emailServiceProvider)
    {
        this.emailServiceProvider = emailServiceProvider;
    }

    public String sendEmail (StudentAddedNotificationRequest studentAddedNotificationRequest)
    {
        logger.info("Sending email via " + this.emailServiceProvider );
        logger.info("Recipient Name: " + studentAddedNotificationRequest.getName());
        logger.info("Recipient Email: " + studentAddedNotificationRequest.getEmail());
        logger.info("Content: New Student Profile Created!");

        int number = random.nextInt();
        String status = "";
        if (number % 2 == 0) status = "Sent";
        else  status = "Failed to send";

        logger.info("Email status: " + status);

        return status;
    }
}
