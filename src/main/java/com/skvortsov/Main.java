package com.skvortsov;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(10.0, 7.0, 2021, 6, 11);

        Car car2 = new Car();
        car2.setFuel(10.0);
        car2.setConsumption(5.0);
        car2.setInspectionDate(2019, 3, 3);
        System.out.println(car2.getInspectionCheck());
        System.out.println(car1.getInspectionCheck());
    }
}