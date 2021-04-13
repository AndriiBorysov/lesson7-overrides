package com.aborysov;

import java.util.Objects;

public class ElectricCar extends Car {
    public int batteryCapacity;
    public int batteryVoltage;

    public ElectricCar(int batteryCapacity,
                       int batteryVoltage,
                       int doorsCount) {
        super(doorsCount);
        this.batteryCapacity = batteryCapacity;
        this.batteryVoltage = batteryVoltage;
    }

    @Override
    public void driveThis() {
        System.out.println("electric drive");
    }

    @Override
    public void ездить() {
        System.out.println("ехать колесами с использованием электродвигателя");
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                batteryCapacity,
                batteryVoltage,
                super.hashCode());
    }

}
