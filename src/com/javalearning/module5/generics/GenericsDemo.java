package com.javalearning.module5.generics;

public class GenericsDemo {
    public static void main(String[] args) {
        // Коробка для строк
        Box<String> stringBox = new Box<>();
        System.out.println("Пусто? " + stringBox.isEmpty()); // true
        stringBox.put("Привет");
        System.out.println("Пусто? " + stringBox.isEmpty()); // false
        System.out.println("Содержимое: " + stringBox.get());

        // Коробка для чисел
        Box<Integer> integerBox = new Box<>();
        System.out.println("Пусто? " + integerBox.isEmpty()); // true
        integerBox.put(42);
        // integerBox.put("Привет"); // ❌ Ошибка! Нельзя добавить строку
        System.out.println("Пусто? " + integerBox.isEmpty()); // false
        System.out.println("Содержимое: " + integerBox.get());
    }
}