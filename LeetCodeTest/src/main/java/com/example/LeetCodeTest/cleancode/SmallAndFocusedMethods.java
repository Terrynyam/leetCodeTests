package com.example.LeetCodeTest.cleancode;

public class SmallAndFocusedMethods {
    /*2. Small and Focused Methods:
    Each method should perform one task and do it well (Single Responsibility Principle).
    Methods should be short, ideally fitting on one screen.*/

    // Bad example
    public void processOrder() {
        // Many unrelated tasks here
    }

//    public void processOrder(Order order) {
//        // Validation logic
//        if (order == null || order.getItems().isEmpty()) {
//            throw new IllegalArgumentException("Order cannot be null or empty");
//        }
//
//        // Calculation logic
//        double total = 0;
//        for (Item item : order.getItems()) {
//            total += item.getPrice();
//        }
//
//        // Payment processing
//        paymentService.processPayment(order.getPaymentDetails(), total);
//    }


    // Good example
    public void calculateTotal() {
        // Calculate the order total
    }

    public void validateOrder() {
        // Validate the order details
    }

//    public void processOrder(Order order) {
//        validateOrder(order);
//        double total = calculateTotal(order);
//        processPayment(order, total);
//    }
//
//    private void validateOrder(Order order) {
//        if (order == null || order.getItems().isEmpty()) {
//            throw new IllegalArgumentException("Order cannot be null or empty");
//        }
//    }
//
//    private double calculateTotal(Order order) {
//        return order.getItems().stream().mapToDouble(Item::getPrice).sum();
//    }
//
//    private void processPayment(Order order, double total) {
//        paymentService.processPayment(order.getPaymentDetails(), total);
//    }

}
