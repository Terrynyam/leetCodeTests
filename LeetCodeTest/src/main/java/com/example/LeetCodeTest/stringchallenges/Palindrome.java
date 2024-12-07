package com.example.LeetCodeTest.stringchallenges;

public class Palindrome {
    /*
    *Explanation: Palindrome is String which can be read same
    * both forth and reverse side or can be said String whose orignal string is
    * same as reverse of String.
    * "AbbA" , "DaD" , etc these are some examples of Palindrom String.
     */
    public static void main(String[] args) {
        String str = "AbbA";
        System.out.println(isPalindrome(str.toLowerCase()));//removing case sensitivity
        System.out.println(isPalindrome(str));//without removing case sensitivity
    }
    private static boolean isPalindrome(String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        return str.contentEquals(builder);
    }
}
