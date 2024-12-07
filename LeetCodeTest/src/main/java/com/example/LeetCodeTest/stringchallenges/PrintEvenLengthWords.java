package com.example.LeetCodeTest.stringchallenges;

public class PrintEvenLengthWords {
    /*
    * All the elements with the length even are printed.
    * "This" length is 4 so printed whereas "a" length is 1 so not Printed.
    * */
    public static void main(String[] args) {
        var string = "This is a java language";
        System.out.println(evenLengthWords(string));
    }

    private static String evenLengthWords(String string) {
        String[] words = string.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() % 2 == 0) {  // Check if the word length is even
                System.out.println(word);
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }

}
