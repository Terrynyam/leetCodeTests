package com.example.LeetCodeTest.stringchallenges;

import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        String name = "Terrance";
        System.out.println(sortString(name));
    }

    private static String sortString(String name) {
        char[] chars = name.toCharArray();
        Arrays.sort(chars);
//        return Arrays.toString(chars);
        return new String(chars);
    }
}
