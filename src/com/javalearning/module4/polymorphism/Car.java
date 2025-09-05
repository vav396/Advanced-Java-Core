package com.javalearning.module4.polymorphism;

public class Car extends Vehicle implements Drivable{

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Двигатель заведен");
    }

    public void honk(){
        System.out.println("Пи-Пи-Пи");
    }
}
