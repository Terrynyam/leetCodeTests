package com.example.LeetCodeTest.cleancode;

public class ProperFormattingAndIndentation {
    // Bad example
    public class Order{public void process(){System.out.println("Processing...");}}

    // Good example
    public class OrderTwo {
        public void process() {
            System.out.println("Processing...");
        }
    }
}
