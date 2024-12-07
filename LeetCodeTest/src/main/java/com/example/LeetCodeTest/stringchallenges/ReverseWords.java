package com.example.LeetCodeTest.stringchallenges;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hello World Terry";
        reverseWords(str);
        System.out.println(reverseWords2(str));
        System.out.println(reverseSentence(str));
    }

    private static void reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
        System.out.println(result.toString().trim());
    }
    public static String reverseWords2(String s) {
        String[] words = s.split(" ");
        StringBuilder a = new StringBuilder();

        // Loop through the words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            // Avoid adding a space after the last word
            if (i != words.length - 1) {
                a.append(" ");
            }
            a.append(words[i]);
        }

        return a.toString();
    }
    public static String reverseSentence(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Reverse the words
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }

        return reversedSentence.toString();
    }
}
