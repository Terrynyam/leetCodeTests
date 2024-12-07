package com.example.LeetCodeTest.solidPrinciples.singleResponsibilityPrinciple;

public class InvoicePrinter {
    /*
     * A class should have only one reason to change,
     * meaning it should have only one responsibility.
     * */

    // Responsibility: Printing logic
    public void print(Invoice invoice) {
        System.out.println("Invoice Total: " + invoice.calculateTotal());
    }
}
