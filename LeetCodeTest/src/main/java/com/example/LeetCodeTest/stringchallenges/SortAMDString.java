package com.example.LeetCodeTest.stringchallenges;

public class SortAMDString {
    public static void main(String[] args) {
        String str = "MAMADAM";
        char [] stringChar = str.toCharArray();
        for (char character: stringChar){
            if((character != 'A') & (character != 'M') & (character != 'D')){
                throw new RuntimeException("Invalid characters");
            }
        }
        var countA = countOccurrences(str,'A');
        var countM = countOccurrences(str,'M');
        var countD = countOccurrences(str,'D');
        // Construct the sorted result
        String sortedString = "A".repeat(countA) + "M".repeat(countM) + "D".repeat(countD);
        System.out.println(sortedString);


    }
    private static int countOccurrences(String str, char target) {
        return (int) str.chars().filter(ch -> ch == target).count();
    }
}
