package com.example.LeetCodeTest.solidPrinciples.interfacesegregation;

public class BasicPrinter implements Printer{
    @Override
    public void printDocument() {
        System.out.println("Document Printed");
    }
}
