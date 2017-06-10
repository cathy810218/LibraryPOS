package com.codefellows;

/**
 * Created by cathyoun on 6/7/17.
 */
public class Designer extends Employee {

    public Designer() {
        super();
    }

    public Designer(String firstName, String lastName, int age) {
        super(firstName, lastName, age, JobType.Desinger);
    }

    @Override
    public void doWork() {
        super.doWork();
        System.out.println("Drawing");
    }
}
