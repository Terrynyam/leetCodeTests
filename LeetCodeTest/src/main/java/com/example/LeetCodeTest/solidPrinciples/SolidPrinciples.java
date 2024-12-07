package com.example.LeetCodeTest.solidPrinciples;

import com.example.LeetCodeTest.solidPrinciples.dependencyinversion.EmailService;
import com.example.LeetCodeTest.solidPrinciples.dependencyinversion.NotificationManager;
import com.example.LeetCodeTest.solidPrinciples.dependencyinversion.NotificationService;
import com.example.LeetCodeTest.solidPrinciples.dependencyinversion.SmsService;
import com.example.LeetCodeTest.solidPrinciples.liskovsubstitution.Bird;
import com.example.LeetCodeTest.solidPrinciples.liskovsubstitution.FlyingBird;
import com.example.LeetCodeTest.solidPrinciples.liskovsubstitution.Ostrich;
import com.example.LeetCodeTest.solidPrinciples.liskovsubstitution.Sparrow;
import com.example.LeetCodeTest.solidPrinciples.singleResponsibilityPrinciple.Invoice;
import com.example.LeetCodeTest.solidPrinciples.singleResponsibilityPrinciple.InvoicePrinter;

public class SolidPrinciples {
    public static void main(String[] args) {
        Invoice newInvoice = new Invoice(100);
        InvoicePrinter invoicePrinter = new InvoicePrinter();
        invoicePrinter.print(newInvoice);

        NotificationService emailService = new EmailService();
        NotificationManager manager = new NotificationManager(emailService);
        manager.notifyUser("Your order has been shipped!");

        NotificationService smsService = new SmsService();
        NotificationManager smsManager = new NotificationManager(smsService);
        smsManager.notifyUser("Your OTP is 123456.");

        FlyingBird bird = new Sparrow();
        Bird ostrich = new Ostrich();
        ostrich.eat();
        bird.eat();
        bird.fly();
    }
}
