package com.codefellows;

/**
 * Created by cathyoun on 6/7/17.
 */
public class Person {
    public String firstName;
    public String lastName;
    public int age;

    // default constructor
    private Person() {

    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String fullName() {
        return firstName + lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", age: " + age;
    }
}
