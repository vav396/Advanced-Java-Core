package com.javalearning.module4.interfaces;

public class InterfaceDemo {
    public static void main(String[] args) {
        Car car = new Car("audi");
        car.start();
        car.stop();
        car.honk();
        Drivable.info();
        Flyable.info();
    }
}
