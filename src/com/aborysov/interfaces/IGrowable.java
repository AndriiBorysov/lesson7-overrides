package com.aborysov.interfaces;

public interface IGrowable {

    /**
     * Выполняет рост текущего объекта.
     */
    void grow();

    boolean canGrowFurther();

    static IGrowable createDefaultGrowable() {
        return new Groot();
    }

    static void growIfCan(IGrowable growable) {
        if (growable.canGrowFurther()) {
            growable.grow();
        }
    }

}
