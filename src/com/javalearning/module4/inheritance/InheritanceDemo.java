package com.javalearning.module4.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Car car = new Car("BMW", 2020,3);
        car.displayInfo();
        car.startEngine();

        Motorcycle motorcycle = new Motorcycle("Yamaha", 2019, true);
        motorcycle.displayInfo();
        motorcycle.startEngine();

        System.out.println(car.getBrand());
        System.out.println(motorcycle.hasSidecar);
    }
}
