package com.aborysov.interfaces;

public class Groot implements IGrowable {
    @Override
    public void grow() {
        System.out.println("I am Groot");
    }

    @Override
    public boolean canGrowFurther() {
        return false;
    }
}
