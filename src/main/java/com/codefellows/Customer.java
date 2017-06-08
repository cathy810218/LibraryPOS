package com.codefellows;

/**
 * Created by cathyoun on 6/7/17.
 */
public class Customer extends Person {
    public int age;
    public Customer(String firstName, String lastName, int age) {
        super(firstName,lastName,age);
    }

    public void doWork() {
        System.out.println("Shopping!");
    }

    @Override
    public String fullName() {
        return "Our valued customer: " + super.fullName();
    }
}