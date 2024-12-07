package com.example.LeetCodeTest.stringchallenges;

public class CheckStringLength {
    public static void main(String[] args) {
        String first = "Terrance";
        String second = "Terrance";
        System.out.println(haveSameLength(first, second));
    }

    private static boolean haveSameLength(String first, String second) {
        if(first == null || second == null)
            throw new IllegalArgumentException("String cannot be null");
        return first.length() == second.length();
    }
}
