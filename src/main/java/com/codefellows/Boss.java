package com.codefellows;

/**
 * Created by cathyoun on 6/7/17.
 */
public class Boss extends Person implements Job {
    public String jobTitle() {
        return "CEO";
    }

    public Boss(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public int salary() {
        return 10000000;
    }
}
