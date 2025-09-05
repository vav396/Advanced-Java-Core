package com.javalearning.module4.interfaces;

public class Car implements Drivable{
    String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public void start() {
        System.out.println("Двигатель заведен");
    }

    @Override
    public void stop() {
        System.out.println("двигатель заглушен");
    }
}
