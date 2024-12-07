package com.example.LeetCodeTest.solidPrinciples.openandclosed;
/*
 * Software entities should be open for extension but closed for modification.
 * */
public class Manager extends Employee {
    @Override
    double calculateSalary() {
        return 5000;
    }
}
