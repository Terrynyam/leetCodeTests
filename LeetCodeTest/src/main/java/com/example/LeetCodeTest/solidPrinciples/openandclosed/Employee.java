package com.example.LeetCodeTest.solidPrinciples.openandclosed;
/*
 * Software entities should be open for extension but closed for modification.
 * You can add new types of Employee without modifying existing classes
 * , adhering to OCP.*/
public abstract class Employee {
    abstract double calculateSalary();
}
