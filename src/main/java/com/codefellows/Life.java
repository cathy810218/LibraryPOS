package com.codefellows;

/**
 * Created by cathyoun on 6/7/17.
 */
public abstract class Life {
    abstract void eat();
    abstract void drink();
    abstract void rest();

    public void eatBreakfast() {
        System.out.println("Eat breakfast");
    }
    public void paidLunch() {
        System.out.println("Eat lunch");
    }
}
