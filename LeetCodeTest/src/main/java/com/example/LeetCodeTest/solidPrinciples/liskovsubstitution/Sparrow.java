package com.example.LeetCodeTest.solidPrinciples.liskovsubstitution;

public class Sparrow implements FlyingBird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }
}
