package com.example.LeetCodeTest.stringchallenges;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class StringRearrangeAdjacent {

    /*
    * Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.

    Return any possible rearrangement of s or return "" if not possible.

    Example 1:

    Input: s = "aab"
    Output: "aba"
    Example 2:

    Input: s = "aaab"
    Output: ""
    * */
    public static void main(String[] args) {
        String input = "aabcc";
        System.out.println(reorganizeString(input));

    }
    public static String reorganizeString(String s) {
        // Step 1: Count the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Add all characters to a max-heap based on their frequency
        PriorityQueue<Character> maxHeap =
                new PriorityQueue<>((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));
        maxHeap.addAll(frequencyMap.keySet());

        // Step 3: Build the result string
        StringBuilder result = new StringBuilder();
        Character prevChar = null;
        while (!maxHeap.isEmpty()) {
            // Get the character with the highest frequency
            char currentChar = maxHeap.poll();
            result.append(currentChar);

            // Decrease the frequency of the current character
            frequencyMap.put(currentChar, frequencyMap.get(currentChar) - 1);

            // If the previous character still has a frequency, add it back to the heap
            if (prevChar != null && frequencyMap.get(prevChar) > 0) {
                maxHeap.add(prevChar);
            }

            // Update the previous character
            prevChar = currentChar;
        }

        // Step 4: Verify if the result is valid
        return result.length() == s.length() ? result.toString() : "";
    }
}
