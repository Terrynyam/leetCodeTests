package com.example.LeetCodeTest.oop;

public class Abstraction {
    /*
    * Abstraction hides implementation details and exposes only the functionality. It can be
    * achieved using abstract classes or interfaces.*/

    abstract static class Vehicle {
        abstract void start();
    }

    static class Car extends Vehicle {
        @Override
        void start() {
            System.out.println("Car starts with a key");
        }
    }


    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start(); // Outputs: Car starts with a key
    }

}
