package com.javalearning.module4.practice;

public abstract class Transport {
    protected String model;
    protected int year;

    public Transport(String model, int year) {
        this.model = model;
        this.year = year;
    }

    abstract void start();
    abstract void move();

    public void info(){
        System.out.println("модель: " + model + " год выпуска: " + year);
    }
}
