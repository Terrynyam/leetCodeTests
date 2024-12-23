package com.example.LeetCodeTest.stringchallenges;

public class StringCount {
    public static void main(String[] args) {
        String input = "aaabbcdd";
        System.out.println(compressString(input));
        System.out.println(compress(input));

    }
    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        var count = 1;
        StringBuilder output = new StringBuilder();
        char currentChar = input.charAt(0);
        for(int i = 1; i < input.length(); i++){
            if(currentChar == input.charAt(i)) {
                count++;
            }
            else{
                output.append(currentChar).append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }
        output.append(currentChar).append(count);
        return output.toString();
    }
    private static String compress(String  str){
        if (str == null || str.isEmpty()) {
            return "";
        }
        char [] stringCharacters = str.toCharArray();
        int initialValue = 0;
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < stringCharacters.length ; i++){
            if(stringCharacters [i] == stringCharacters [initialValue])
            {
                count++;
            }else {
                sb.append(stringCharacters[initialValue]).append(count);
                initialValue = i;
                count = 1;
            }
        }
        sb.append(stringCharacters[initialValue]).append(count);
        return sb.toString();
    }
}
