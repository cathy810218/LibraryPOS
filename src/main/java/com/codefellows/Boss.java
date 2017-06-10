package com.codefellows;

/**
 * Created by cathyoun on 6/7/17.
 */
public class Boss extends Person{
    public String jobTitle() {
        return "CEO";
    }

    public Boss(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }
}
