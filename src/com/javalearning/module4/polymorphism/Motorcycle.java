package com.javalearning.module4.polymorphism;

public class Motorcycle extends Vehicle implements Drivable{
    public Motorcycle(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Двигатель запущен");
    }

    public void wheelie(){
        System.out.println(" Вращение колесом");
    }
}
