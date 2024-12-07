package com.example.LeetCodeTest.solidPrinciples.interfacesegregation;

public interface Scanner {
    /*
    * A class should not be forced to implement interfaces it does not use.*/
    void scanDocument();
}
