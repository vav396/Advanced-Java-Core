package com.javalearning.module4.interfaces;

public interface Flyable {
    static void info() {
    }

    void takenOff();
    void land();

    default void fly() {
        System.out.println("Летит...");
    }
}
