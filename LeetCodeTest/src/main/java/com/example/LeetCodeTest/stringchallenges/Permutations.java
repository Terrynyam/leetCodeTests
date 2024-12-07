package com.example.LeetCodeTest.stringchallenges;

public class Permutations {
    public static void main(String[] args) {
        String str = "abcd";
        printPermutations(str, 0, str.length() - 1);
    }

    public static void printPermutations(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                printPermutations(str, left + 1, right);
                str = swap(str, left, i);  // backtrack
            }
        }
    }

    // Method to swap characters in a string
    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }
}
