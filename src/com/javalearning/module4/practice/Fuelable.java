package com.javalearning.module4.practice;

public interface Fuelable {
    default void refuel() {
        System.out.println("Автомобиль заправляется");
    }
}
