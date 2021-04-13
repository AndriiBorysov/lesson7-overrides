package com.aborysov.interfaces;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {

        IGrowable tree = createRandomGrowable();
        tree.grow();

        IGrowable.growIfCan(tree);
    }

    private IGrowable createRandomGrowable() {
        IGrowable result;

        double chance = Math.random();
        if (chance > 0.5) {
            result = new Groot();
        } else if (chance > 0.1) {
            result = new OakTree();
        } else {
            result = IGrowable.createDefaultGrowable();
        }

        return result;
    }
}
