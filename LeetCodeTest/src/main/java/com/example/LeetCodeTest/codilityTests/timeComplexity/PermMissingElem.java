package com.example.LeetCodeTest.codilityTests.timeComplexity;

import java.util.Arrays;

/**
 * @author Terrance Nyamfukudza
 * 17/9/2024
 */
public class PermMissingElem {
    /*
    *
    * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
* */
    public int solution(int[] array){
        int expectedSum = 0;
        int actualSum = 0;
        var a = Arrays.stream(array).max().getAsInt();
        for(int i = a; i > 0; i--){
            expectedSum +=i;
        }
        for(int b : array){
            actualSum += b;
        }
        return  expectedSum - actualSum;
    };
    public int solution1(int[] A) {
        int N = A.length;
        // Calculate the sum of the first N+1 natural numbers
        int totalSum = (N + 1) * (N + 2) / 2;

        // Calculate the sum of the elements in the array
        int arraySum = 0;
        for (int j : A) {
            arraySum += j;
        }

        // The missing element is the difference between the total sum and the array sum
        return totalSum - arraySum;
    }

    public int solution3(int[] A) {
        int N = A.length;
        int xorSum = 0;

        // XOR all the numbers from 1 to N+1
        for (int i = 1; i <= N + 1; i++) {
            xorSum ^= i;
        }

        // XOR all the elements in the array
        for (int i = 0; i < N; i++) {
            xorSum ^= A[i];
        }

        // The result is the missing number
        return xorSum;

}
    public static void main(String[] args) {

        int[] array = {1,2,4};
        PermMissingElem permMissingElem = new PermMissingElem();
        System.out.println(permMissingElem.solution3(array));
    }
}
