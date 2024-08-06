package com.example.NotificationMicroservice.configuration;

import com.example.NotificationMicroservice.emailservice.AbstractEmailService;
import com.example.NotificationMicroservice.emailservice.EmailService;
import com.example.NotificationMicroservice.emailservice.GmailEmailServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class GmailEmailServiceConfig
{
    @Bean
    public AbstractEmailService emailService()
    {
        return new GmailEmailServiceImpl();
    }
}
