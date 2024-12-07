package com.example.LeetCodeTest.solidPrinciples.interfacesegregation;

public interface Printer {
    /*
    * A class should not be forced to implement interfaces it does not use.*/
    void printDocument();
}
