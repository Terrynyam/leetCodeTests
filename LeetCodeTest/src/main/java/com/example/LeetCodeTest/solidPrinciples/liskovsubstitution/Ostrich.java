package com.example.LeetCodeTest.solidPrinciples.liskovsubstitution;

public class Ostrich implements Bird {
    @Override
    public void eat() {
        System.out.println("Ostrich is eating");
    }
}
