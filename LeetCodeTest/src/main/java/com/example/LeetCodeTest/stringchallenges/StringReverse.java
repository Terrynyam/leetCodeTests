package com.example.LeetCodeTest.stringchallenges;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello World";
        reverseMethod(str);
        reverseWithStringBuilder(str);
        reverseWithStringBuffer(str);
        reverseWthToCharArray(str);

    }
    private static void reverseMethod(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }
    private static void reverseWithStringBuilder(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());
    }
    private static void reverseWithStringBuffer(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());
    }

    private static void reverseWthToCharArray(String str) {
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    } // reverse with toCharArray

}
