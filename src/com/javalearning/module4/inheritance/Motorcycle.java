package com.javalearning.module4.inheritance;

public class Motorcycle extends Vehicle{
    boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Марка: " + getBrand() + ", Год: " + year + ", Имеет коляску: " + hasSidecar);
    }

    @Override
    public void startEngine() {
        System.out.println("Мотоцикл заведён");
    }
}
