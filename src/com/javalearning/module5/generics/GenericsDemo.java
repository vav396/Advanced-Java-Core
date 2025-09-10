package com.javalearning.module5.generics;

public class GenericsDemo {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.put("Привет");
        System.out.println(stringBox.isEmpty());

        Box<Integer> integerBox = new Box<>();
        integerBox.put(42);
        System.out.println(integerBox.isEmpty());
    }
}
