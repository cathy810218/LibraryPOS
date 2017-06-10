package com.codefellows;

/**
 * Created by cathyoun on 6/7/17.
 */
public class Employee extends Person {
    public String title;
    public JobType jobType;

    public Employee() {
        super();
    }

    public Employee(String firstName, String lastName, int age, JobType jobType) {
        super(firstName,lastName,age);
        this.jobType = jobType;
    }

    public void doWork() {
        System.out.print("I'm doing work - ");
    }
}
