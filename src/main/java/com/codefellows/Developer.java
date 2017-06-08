package com.codefellows;

/**
 * Created by cathyoun on 6/7/17.
 */
public class Developer extends Employee {

    public Developer(String firstName, String lastName, int age) {
        super(firstName, lastName, age, JobType.Developer);
    }

    @Override
    public void doWork() {
        super.doWork();
        System.out.println("Coding");
    }
}
