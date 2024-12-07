package com.example.LeetCodeTest.stringchallenges;

public class StringMemoryOptimization {

    //From this code we can see that we can reduce the memory usage by using StringBuilder
    public void testString()
    {
        int i = 0;
        while(i < 100000000)
        {
            String s ="Hi hello bye" +i;
            i++;
        }
    }

    //To this code we can see that we can reduce the memory usage by using StringBuilder
    public void testStringWithStringBuilder() {
        int i = 0;
        StringBuilder sb = new StringBuilder(); // Reuse the same StringBuilder
        while (i < 100000000) {
            sb.setLength(0); // Clear the contents instead of creating a new object
            sb.append("Hi hello bye").append(i);
            i++;
        }
    }

}
