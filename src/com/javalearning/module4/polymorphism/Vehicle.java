package com.javalearning.module4.polymorphism;

public abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void start();

    public void stop() {
        System.out.println("Двигатель остановлен");
    }
}
