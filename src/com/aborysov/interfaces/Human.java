package com.aborysov.interfaces;

public class Human implements IGrowable {
    @Override
    public void grow() {
        System.out.println(">:)");
    }

    @Override
    public boolean canGrowFurther() {
        return true;
    }
}
