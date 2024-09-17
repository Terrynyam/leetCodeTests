package com.example.LeetCodeTest.codilityTests.timeComplexity;

/**
 * @author Terrance Nyamfukudza
 * 17/9/2024
 */
public class FrogJmp {
    public int solution(int X, int Y, int D){
        int distance = Y - X;
        if(distance % D == 0){
            return distance / D;
        }
        return (distance/D) + 1;
    };

    public int solution2(int X, int Y, int D) {
        return (int) Math.ceil((double) (Y - X) / D);
    }
}
