package com.example.LeetCodeTest.stringchallenges;

import java.util.Arrays;

public class Anagram {
    /*
    * A string is called Anagram of other string when it contains the same characters
    * , only the order of characters can be different.
    * Example Listen and Silent
    * */

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        System.out.println(isAnagram(str1,str2));
    }

    private static boolean isAnagram(String str1, String str2) {
        if (!(str1.length() == str2.length()))
            return false;

        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        return Arrays.equals(ch1,ch2);
    }
}
