package com.example.LeetCodeTest.stringchallenges;

public class StringSwap {
    /*
    *
    * Q: Given 2 string variables and an integer variable. Swap the values of the 2 string variables
    * without introducing any other variables*/

    public static void main(String[] args) {
        String name = "Terrance";
        String surname = "Nyamfukudza";
        int age = 31;
        System.out.println(swapValues(name,surname));

    }

    private static String swapValues(String name, String surname) {
        name = name+surname;
        surname = name.substring(0,name.length()-surname.length());
        name = name.substring(surname.length());
        return name +" "+surname;
    }
}
