package com.javalearning.module4.polymorphism;

public class PolyDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("BMW"),
                new Motorcycle("Yamaha")
        };

        // Полиморфный вызов start()
        for (Vehicle v : vehicles) {
            v.start();
            v.stop();
        }

        // Проверка типа и вызов специфичных методов
        for (Vehicle v : vehicles) {
            if (v instanceof Car) {
                ((Car) v).honk();
            } else if (v instanceof Motorcycle) {
                ((Motorcycle) v).wheelie();
            }
        }

        // Полиморфизм через интерфейс
        Drivable[] drivables = { new Car("Audi"), new Motorcycle("Harley") };
        for (Drivable d : drivables) {
            d.start();
            d.stop();
        }
    }
}
