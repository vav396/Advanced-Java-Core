package com.javalearning.module4.practice;

public class Car extends Transport implements Fuelable,Servicable {
    public Car(String model, int year) {
        super(model, year);
    }

    @Override
    void start() {
        System.out.println("Автомобиль завелся");
    }

    @Override
    void move() {
        System.out.println("Автомобиль едет");
    }

    @Override
    public void refuel() {
        Fuelable.super.refuel();
    }

    @Override
    public void service() {
        Servicable.super.service();
    }
}
