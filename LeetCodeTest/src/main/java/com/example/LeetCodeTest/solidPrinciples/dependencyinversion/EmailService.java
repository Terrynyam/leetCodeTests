package com.example.LeetCodeTest.solidPrinciples.dependencyinversion;

public class EmailService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email: " + message);
    }
}
