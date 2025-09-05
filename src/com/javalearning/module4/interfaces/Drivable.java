package com.javalearning.module4.interfaces;

public interface Drivable {
    void start() ;
    void stop();

    default void honk(){
        System.out.println("Би-бип");
    }

    static void info(){
        System.out.println("Это транспортное средство может двигатся");
    }
}
