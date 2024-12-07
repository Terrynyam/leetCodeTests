package com.example.LeetCodeTest.stringchallenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OccurrencesInString {
    public static void main(String[] args) {
        String string= "Java Programming Language";
        countOccurences(string);
        countOccurences2(string);
    }

    private static void countOccurences(String string) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = string.toCharArray();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println(chars);
    }
    private static void countOccurences2(String string) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = string.toCharArray();
        for (char c : chars) {
            map.merge(c, 1, Integer::sum);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
