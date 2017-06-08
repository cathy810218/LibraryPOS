package com.codefellows;

/**
 * Created by cathyoun on 6/7/17.
 */
public class Employee extends Person {
    public String title;

    public Employee(String firstName, String lastName, int age) {
        super(firstName,lastName,age);
    }

    public void doWork() {
        System.out.println("I'm doing work");
    }

}
