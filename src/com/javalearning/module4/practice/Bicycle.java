package com.javalearning.module4.practice;

public class Bicycle extends Transport{
    public Bicycle(String model, int year) {
        super(model, year);
    }

    @Override
    void start() {
        System.out.println("Велосипед стартовал");
    }

    @Override
    void move() {
        System.out.println("Велосипед едет");
    }
}
