package com.example.LeetCodeTest.solidPrinciples.singleResponsibilityPrinciple;

public class Invoice {
    /*
    * A class should have only one reason to change,
    * meaning it should have only one responsibility.
    * */
    private double amount;

    public Invoice(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }
    // Responsibility: Calculation logic
    public double calculateTotal() {
        return amount * 1.15; // Adding 15% tax
    }

}
