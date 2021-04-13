package com.aborysov;

public class Main {

    public static void main(String[] args) {
        String string1 = "100";
        String string2 = "100";
        String string3 = "100500";
        System.out.println("string1.hashCode(): " + string1.hashCode());
        System.out.println("string2.hashCode(): " + string2.hashCode());
        System.out.println("string3.hashCode(): " + string3.hashCode());


        Car car = new Car(5);
        System.out.println("car.hashCode(): " + car.hashCode());
        Car car2 = new Car(10);
        System.out.println("car2.hashCode(): " + car2.hashCode());
        Object object = new Object();
        System.out.println("object.hashCode(): " + object.hashCode());

        ElectricCar car3 = new ElectricCar(
                10_000, 13_100, 2);
        car3.driveThis();
        System.out.println("car3.hashCode(): " + car3.hashCode());

        FlyingElectricCar car4 = new FlyingElectricCar(
                30,
                10_000, 13_100, 2);
        car4.doAnything();
        System.out.println("car4.hashCode(): " + car4.hashCode());
    }

    public static double pow(double x, double y) {
        return Math.pow(x, y);
    }
}
