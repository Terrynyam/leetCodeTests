package com.example.LeetCodeTest.oop;

public class Inheritance {
    /*Inheritance allows one class to inherit fields and methods from another class, promoting code reuse
*/
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }
    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }
    /*Explanation:
    Dog inherits from Animal. The Dog class overrides the sound() method to provide its own
    implementation.*/
}
