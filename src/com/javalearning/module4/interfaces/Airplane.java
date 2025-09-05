package com.javalearning.module4.interfaces;

public class Airplane implements Drivable, Flyable {
    @Override
    public void start() {
        System.out.println("двигатель запущен");
    }

    @Override
    public void stop() {
        System.out.println("двигатель остановлен");
    }

    @Override
    public void takenOff() {
        System.out.println("взлет");
    }

    @Override
    public void land() {
        System.out.println("посадка");
    }
}
