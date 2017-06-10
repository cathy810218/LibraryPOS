package com.codefellows;

/**
 * Created by cathyoun on 6/10/17.
 * Factory Patterns
 */
public class JobFactory {
    public Job getJob(JobType jobType) {
        if (jobType == null) {
            return null;
        }
        switch (jobType) {
            case Developer:
                return new Programming();
            case Desinger:
                return new Designing();
        }
        return null;
    }
}
