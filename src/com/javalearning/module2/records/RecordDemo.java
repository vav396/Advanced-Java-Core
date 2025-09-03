package com.javalearning.module2.records;

import java.math.BigDecimal;

public class RecordDemo {
    public static void main(String[] args) {
        Product bread = new Product("Хлеб", new BigDecimal("50"), 10);
        Product milk = new Product("Молоко", new BigDecimal("80"), 5);
        Product cheese = new Product("Сыр", new BigDecimal("250"), null); // null — количество неизвестно

        // Вывод через toString()
        System.out.println(bread);
        System.out.println(milk);
        System.out.println(cheese);

        // Сравнение
        Product хлеб2 = new Product("Хлеб", new BigDecimal("50"), 10);
        System.out.println("хлеб.equals(хлеб2): " + bread.equals(хлеб2)); // true
    }
}
