package com.skvortsov;

import java.time.LocalDate;

public class Car {
    private double fuel; // количество бензина в баке
    private double consumption; // расход топлива на 100 км
    private LocalDate inspectionDate; // дата тех осмотра

    public double getFuel() {
        return fuel;
    }

    public double getConsumption() {
        return consumption;
    }

    public LocalDate getInspectionDate() {
        return inspectionDate;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public void setInspectionDate(int year, int month, int day){
        this.inspectionDate = LocalDate.of(year, month, day);
    }

    public Car(double fuel, double consumption, int year, int month, int day) {
        this.fuel = fuel;
        this.consumption = consumption;
        this.inspectionDate = LocalDate.of(year, month, day);
    }

    public Car() {
    }

    public boolean canDrive() {
        return fuel > 0;
    }

    public double getDistance() {
        return fuel / consumption * 100;
    }

    public boolean getInspectionCheck() {
        LocalDate currentDate = LocalDate.now(); // текущее время на момент использования метода
        LocalDate checkTime = currentDate.minusYears(2); // минус 2 года от сегодняшнего дня (узнаем последний допустимый день тех осмотра)
        return inspectionDate.isAfter(checkTime); // узнаем была дата тех осмотра до или после последнего допустимого дня тех осмотра
    }
}