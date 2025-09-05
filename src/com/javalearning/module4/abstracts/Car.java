package com.javalearning.module4.abstracts;

import com.javalearning.module4.inheritance.Vehicle;

public class Car extends Vehicle {
    protected int doors;


    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Марка: " + getBrand() + ", Год: " + year + ", Дверей: " + doors);
    }

    @Override
    public void startEngine() {
        System.out.println("Автомобиль завелся");
    }
}
