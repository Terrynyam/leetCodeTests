package com.example.LeetCodeTest.cleancode;

public class AvoidLongParameterLists {
    /*Explanation:
    Use objects or builder patterns to pass multiple parameters, especially if they are related.

    Use objects to encapsulate multiple parameters.
    This improves readability and makes the code easier to extend.*/

    // Bad example
    public void createOrder(String item, int quantity, String address, String paymentMethod) {
        // Create order
    }

    // Good example
    public void createOrder(Order order) {
        // Create order
    }

    class Order {
        String item;
        int quantity;
        String address;
        String paymentMethod;

    }

}
