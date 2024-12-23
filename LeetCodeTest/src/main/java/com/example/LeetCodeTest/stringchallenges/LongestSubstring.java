package com.example.LeetCodeTest.stringchallenges;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    /*
    * 3. Longest Substring Without Repeating Characters
        Medium
        Topics
        Companies
        Hint
        Given a string s, find the length of the longest
        substring
         without repeating characters.



        Example 1:

        Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.
        Example 2:

        Input: s = "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.
        Example 3:

        Input: s = "pwwkew"
        Output: 3
        Explanation: The answer is "wke", with the length of 3.
        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
        * */
    public static void main(String[] args) {
        String input = "abcabcd";
        System.out.println(longestSubstring(input));
    }
    private static Integer longestSubstring(String input){
        if (input == null || input.isEmpty()) {
            return 0;
        }
        System.out.println(lengthOfLongestSubstring(input));

        Map<Character,Integer> countOccurrence = new HashMap<>();
        Map<String,Integer> stringOccurrence = new HashMap<>();


        for(char character : input.toCharArray()){
            if(countOccurrence.containsKey(character)){
                updateMap(countOccurrence,stringOccurrence);
                countOccurrence.clear();
            }
            //countOccurrence.put(character, countOccurrence.getOrDefault(character,0) +1 );
            countOccurrence.merge(character,1,Integer::sum);
        }
        updateMap(countOccurrence,stringOccurrence);
        System.out.println(stringOccurrence.keySet());
        return stringOccurrence.values().stream().max(Integer::compareTo).get();
    }
    private static void updateMap(Map<Character,Integer> countOccurrence,
                                  Map<String,Integer> stringOccurrence){
        StringBuilder builder = new StringBuilder();
        countOccurrence.forEach((c,integer)-> builder.append(c));
        stringOccurrence.put(builder.toString(),builder.toString().length());
    }

    private static int lengthOfLongestSubstring(String input) {
        Map<Character, Integer> countOccurrence = new HashMap<>();
        int maxLength = 0;
        StringBuilder currentSubstring = new StringBuilder();

        for (char character : input.toCharArray()) {
            if (countOccurrence.containsKey(character)) {
                maxLength = Math.max(maxLength, currentSubstring.length());
                currentSubstring.setLength(0);
                countOccurrence.clear();
            }
            countOccurrence.put(character, countOccurrence.getOrDefault(character, 0) + 1);
            currentSubstring.append(character);
        }

        // Update max length for the last substring
        maxLength = Math.max(maxLength, currentSubstring.length());
        return maxLength;
    }

}
