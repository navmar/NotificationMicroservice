package com.example.NotificationMicroservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentAddedNotificationRequest
{
    private long id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String email;
}
