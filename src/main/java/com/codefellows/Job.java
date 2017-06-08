package com.codefellows;

/**
 * Created by cathyoun on 6/7/17.
 */
enum JobType {
    Developer,
    Desinger
}

public interface Job {
    String jobTitle();
    int salary();
}
