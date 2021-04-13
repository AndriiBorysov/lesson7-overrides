package com.aborysov;

import java.util.Objects;

public class FlyingElectricCar extends ElectricCar {
    public int maxHeight;

    public FlyingElectricCar(int maxHeight,
                             int batteryCapacity,
                             int batteryVoltage,
                             int doorsCount) {
        super(batteryCapacity, batteryVoltage, doorsCount);
        this.maxHeight = maxHeight;
    }

    public void doAnything() {
        System.out.println("FlyingElectricCar.doAnything:");
        this.driveThis();
        ездить();
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                maxHeight,
                super.hashCode());
    }

    @Override
    public String toString() {
        return "FlyingElectricCar{" +
                "doorsCount=" + doorsCount +
                ", batteryCapacity=" + batteryCapacity +
                ", batteryVoltage=" + batteryVoltage +
                ", maxHeight=" + maxHeight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FlyingElectricCar that = (FlyingElectricCar) o;
        return maxHeight == that.maxHeight; // FIXME не все поля проверены
    }
}
