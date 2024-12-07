package com.example.LeetCodeTest.cleancode;

public class DryPrinciple {
    /*Explanation:
    DRY - Don't Repeat Yourself
    Reuse code to reduce redundancy and improve maintainability.*/

    double length1 = 10;
    double width1 = 5;
    double length2 = 8;
    double width2 = 4;


    //Bad example
    double rectangleArea1 = length1 * width1;
    double rectangleArea2 = length2 * width2;

    //Good example
    public double calculateArea(double length, double width) {
        return length * width;
    }

}
