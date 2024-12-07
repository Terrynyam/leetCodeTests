package com.example.LeetCodeTest.oop;

public class Encapsulation {
    /*
    * Encapsulation is the bundling of data (fields) and methods (functions) that operate on the
    * data into a single unit, i.e., a class. It also involves restricting direct access to
    * some of the object’s components using access modifiers like private, protected, and public.
    * */

    //Given this class is for Person object

    private String name;
    private int age;

    // Constructor
    public Encapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    /*Explanation:
    The fields name and age are private, meaning they can only be accessed through public getter and setter methods,
    ensuring control over the data.*/
}
