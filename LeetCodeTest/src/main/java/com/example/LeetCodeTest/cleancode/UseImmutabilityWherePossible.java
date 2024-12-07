package com.example.LeetCodeTest.cleancode;

public class UseImmutabilityWherePossible {
    /*Make fields final and use immutable objects to avoid unintended modifications.
    java*/

    public class Person {
        private final String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

}
