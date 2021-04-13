package com.aborysov.interfaces;

public class Forest implements IGrowable {
    private IGrowable[] growables;

    public Forest(IGrowable[] growables) {
        this.growables = growables;
    }

    @Override
    public void grow() {
        for (int i = 0; i < growables.length; i++) {
            IGrowable growable = growables[i];
            growable.grow();
        }
    }

    @Override
    public boolean canGrowFurther() {
        for (int i = 0; i < growables.length; i++) {
            IGrowable growable = growables[i];
            if (growable.canGrowFurther()) {
                return true;
            }
        }

        return false;
    }
}
