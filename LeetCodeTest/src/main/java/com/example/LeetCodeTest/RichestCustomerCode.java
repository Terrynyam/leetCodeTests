package com.example.LeetCodeTest;

import java.util.Arrays;

/**
 * @author Terrance Nyamfukudza
 * 17/5/2024
 */
public class RichestCustomerCode {
    //You are given an m x n integer grid accounts where accounts[i][j]
    // is the amount of money the customer has in the bank.
    // Return the wealth that the richest customer has.
    //A customer's wealth is the amount of money they have in all their bank accounts.
    // The richest customer is the customer that has the maximum wealth.

    //Example:

    //Input: accounts = [[1,2,3],[3,2,1]]
    //Output: 6
    //Explanation:
    //1st customer has wealth = 1 + 2 + 3 = 6
    //2nd customer has wealth = 3 + 2 + 1 = 6
    //Both customers are considered the richest with a wealth of 6 each, so return 6.
    public int maximumWealth(int[][] accounts) {
        var arrayOne = new int[accounts.length];
        for (int a = 0; a < accounts.length; a++){
            var arrayTwo = accounts[a];
            var sum = 0;
            for (int i : arrayTwo) {
                sum += i;
            }
            arrayOne[a] = sum;
        }

        return Arrays.stream(arrayOne).max().getAsInt();
    }
    public int maximumWealth1(int[][] accounts) {
        var maxNumber = 0;
        for(int [] account : accounts){
            var arrayNumber = 0;
            for(int i : account){
                arrayNumber += i;
            }
            maxNumber = Math.max(maxNumber, arrayNumber);

        }
        return maxNumber;

    }

    public static void main(String[] args) {
        RichestCustomerCode challenge = new RichestCustomerCode();
        System.out.println(
        challenge.maximumWealth1(new int[][]{{1,2,3,7},{3,4,2,1}}));
    }
}
