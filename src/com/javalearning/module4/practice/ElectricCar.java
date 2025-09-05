package com.javalearning.module4.practice;

public class ElectricCar extends Transport implements Servicable{
    public ElectricCar(String model, int year) {
        super(model, year);
    }

    @Override
    void start() {
        System.out.println("Electric car started");
    }

    @Override
    void move() {
        System.out.println("Electric car moving");
    }

    @Override
    public void service() {
        Servicable.super.service();
    }
}
