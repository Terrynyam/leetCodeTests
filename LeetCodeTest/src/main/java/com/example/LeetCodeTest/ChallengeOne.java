package com.example.LeetCodeTest;

/**
 * @author Terrance Nyamfukudza
 * 17/5/2024
 */
public class ChallengeOne {
    // 1D array Challenge

    public int[] runningSum(int[] nums) {
        var newArray =new int [nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum  += nums[i];
            newArray[i] = sum;
        }
        return newArray;
        }
    public int[] runningSum1(int[] nums) {
        var newArray =new int [nums.length];
        newArray[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            newArray[i] = nums[i];
        }
        return newArray;
    }

    public int[] runningSum2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        ChallengeOne challenge = new ChallengeOne();
        challenge.runningSum(new int[]{1,2,3,4,5});
    }
}
