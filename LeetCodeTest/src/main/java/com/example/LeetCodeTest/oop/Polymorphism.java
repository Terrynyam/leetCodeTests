package com.example.LeetCodeTest.oop;

public class Polymorphism {
    /*
    * refers to changing the behavior of the super class in subclasses
    * through overriding (Run-time polymorphism) and overloading (Compile-time polymorphism)*/

     /*
    * 1. Compile-time Polymorphism (Method Overloading)
        Definition: The method to be called is determined at compile time based on the method
        signature (number and type of parameters).
        Reason for the name:
        The compiler decides which overloaded method to invoke when the code
        is being compiled, before the program runs.
        *
        *
     *2. Run-time Polymorphism (Method Overriding)
        Definition: The method to be called is determined at runtime based on the actual object type,
        not the reference type.This is achieved through method overriding.
        Reason for the name:
        The exact method to execute is resolved at runtime by the Java Virtual Machine (JVM),
        depending on the object's actual class.
    * */


    //method overloading
    static class MathUtils {
        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }
        String add(String a, String b) {
            return a + b;
        }
    }

    //method overriding

    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Cat(); // Upcasting
        animal.sound(); // Outputs: Cat meows
        MathUtils math = new MathUtils();
        System.out.println(math.add(2, 3));        // Calls add(int, int)
        System.out.println(math.add(2, 3, 4));
    }

}
