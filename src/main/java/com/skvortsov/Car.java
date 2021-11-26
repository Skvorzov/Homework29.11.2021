package com.skvortsov;

public class Car {
    private double fuel; // количество бензина в баке
    private double consumption; // расход топлива на 100 км

    public double getFuel() {
        return fuel;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public Car(double fuel, double consumption) {
        this.fuel = fuel;
        this.consumption = consumption;
    }

    public Car() {
    }

    public boolean canDrive() {
        return fuel > 0;
    }

    public double getDistance() {
        return fuel / consumption * 100;
    }
}