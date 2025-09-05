package com.javalearning.module4.abstracts;

public abstract class Vehicle {
    private String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void displayInfo() {
        System.out.println("Марка: " + brand + ", Год: " + year);
    }

    public abstract void startEngine() ;
}
