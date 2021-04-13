package com.aborysov;

import java.util.Objects;

public class Car {
    public int doorsCount;

    public Car(int doorsCount) {
        this.doorsCount = doorsCount;
    }

    public void driveThis() {
        System.out.println("base drive");
    }

    public void ездить() {
        System.out.println("эта машина ездит как-то");
    }

    @Override
    public int hashCode() {
        return Objects.hash(doorsCount);
    }
}
