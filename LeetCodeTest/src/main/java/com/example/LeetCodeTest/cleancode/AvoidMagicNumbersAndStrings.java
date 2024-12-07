package com.example.LeetCodeTest.cleancode;

public class AvoidMagicNumbersAndStrings {
    /*Use constants or enums for hard-coded values.*/

    /*In computer programming, a magic string is an input that a programmer believes will never come
    externally and which activates otherwise hidden functionality*/

    // Bad example
    int timeout = 3000;
//    double area = 3.14159 * radius * radius;


    // Good example
    private static final int TIMEOUT_MILLISECONDS = 3000;
//    final double PI = 3.14159;
//    double area = PI * radius * radius;

}
