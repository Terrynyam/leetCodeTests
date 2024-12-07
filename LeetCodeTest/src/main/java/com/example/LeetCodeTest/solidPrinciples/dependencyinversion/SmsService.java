package com.example.LeetCodeTest.solidPrinciples.dependencyinversion;

public class SmsService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending sms: " + message);
    }
}
