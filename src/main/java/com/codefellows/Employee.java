package com.codefellows;

/**
 * Created by cathyoun on 6/7/17.
 */
public class Employee extends Person implements Job {
    public String title;
    public JobType jobType;

    public Employee(String firstName, String lastName, int age, JobType jobType) {
        super(firstName,lastName,age);
        this.jobType = jobType;
    }

    public void doWork() {
        System.out.print("I'm doing work - ");
    }

    public String jobTitle() {
        switch (jobType) {
            case Developer:
                return "Developer";
            case Desinger:
                return "Designer";
        }
        return "Undefined";
    }

    public int salary() {
        switch (jobType) {
            case Developer:
                return 100000;
            case Desinger:
                return 90000;
        }
        return 0;
    }
}
