package com.javalearning.module4.practice;

public class Main {
    public static void main(String[] args) {
        Transport[] transports = {
                new Car("BMW", 2022),
                new ElectricCar("Tesla", 2023),
                new Bicycle("Bike", 2021)
        };

        for (Transport t : transports) {
            t.start();
            t.move();
            t.info();
        }

        for (Transport t : transports) {
            if (t instanceof Car) {
                ((Car) t).refuel();((Car) t).service();
            }else if (t instanceof ElectricCar) {
                ((ElectricCar) t).service();
            }
        }
    }
}
