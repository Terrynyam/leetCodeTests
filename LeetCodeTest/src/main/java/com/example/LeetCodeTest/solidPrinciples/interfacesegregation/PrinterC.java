package com.example.LeetCodeTest.solidPrinciples.interfacesegregation;

public interface PrinterC {
    /*
    * A class should not be forced to implement interfaces it does not use.*/
    void printDocument();
    void scanDocument();
    void faxDocument();
}
