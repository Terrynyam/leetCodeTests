package com.example.LeetCodeTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Terrance Nyamfukudza
 * 17/5/2024
 */
public class FizzBuzz {

//    Given an integer n, return a string array answer (1-indexed) where:
//
//    answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//    answer[i] == "Fizz" if i is divisible by 3.
//    answer[i] == "Buzz" if i is divisible by 5.
//    answer[i] == i (as a string) if none of the above conditions are true.

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(i%3 == 0 && i%5 == 0) list.add("FizzBuzz");
            else if(i%3 == 0) list.add("Fizz");
            else if(i%5 == 0) list.add("Buzz");
            else list.add(String.valueOf(i));
        }
        return list;
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.fizzBuzz(15));

    }
}
