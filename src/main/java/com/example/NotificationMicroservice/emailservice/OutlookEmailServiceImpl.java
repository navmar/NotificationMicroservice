package com.example.NotificationMicroservice.emailservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class OutlookEmailServiceImpl extends AbstractEmailService
{
    public OutlookEmailServiceImpl()
    {
        super("outlook");
    }
}
