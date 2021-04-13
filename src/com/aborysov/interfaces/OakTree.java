package com.aborysov.interfaces;

public class OakTree implements IGrowable {
    @Override
    public void grow() {
        System.out.println("oak...");
    }

    @Override
    public boolean canGrowFurther() {
        return false;
    }
}
