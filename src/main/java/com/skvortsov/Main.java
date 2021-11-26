package com.skvortsov;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(10.0, 7.0);

        Car car2 = new Car();
        car2.setFuel(10.0);
        car2.setConsumption(5.0);
        System.out.println(car1.getFuel() + " " + car2.getFuel() + " " + car1.getDistance() + " " + car2.getDistance());
    }
}