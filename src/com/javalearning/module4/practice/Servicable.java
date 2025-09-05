package com.javalearning.module4.practice;

public interface Servicable {
    default void service() {
        System.out.println("Автомобиль сервисируется");
    }
}
