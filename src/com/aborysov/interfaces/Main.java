package com.aborysov.interfaces;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        IGrowable tree = createRandomGrowable();
        tree.grow();

        if (tree instanceof Groot) {
            Groot groot = (Groot) tree;
            groot.saySomething();
        }
    }

    private IGrowable createRandomGrowable() {
        IGrowable result;

        double chance = Math.random();
        if (chance > 0.9) {
            IGrowable[] growables = new IGrowable[]{
                    createRandomGrowable(),
                    createRandomGrowable(),
                    createRandomGrowable(),
            };
            result = new Forest(growables);
        } else if (chance > 0.7) {
            result = new Human();
        } else if (chance > 0.5) {
            Groot groot = new Groot();
            // groot.saySomething();
            result = groot;
        } else if (chance > 0.1) {
            result = new OakTree();
        } else {
            result = IGrowable.createDefaultGrowable();
        }

        return result;
    }
}
