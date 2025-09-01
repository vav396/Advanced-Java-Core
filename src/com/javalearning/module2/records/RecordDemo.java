package com.javalearning.module2.records;

import java.math.BigDecimal;

public class RecordDemo {
    public static void main(String[] args) {
        Product хлеб = new Product("Хлеб", new BigDecimal("50"), 10);
        Product молоко = new Product("Молоко", new BigDecimal("80"), 5);
        Product сыр = new Product("Сыр", new BigDecimal("250"), null); // null — количество неизвестно

        // Вывод через toString()
        System.out.println(хлеб);
        System.out.println(молоко);
        System.out.println(сыр);

        // Сравнение
        Product хлеб2 = new Product("Хлеб", new BigDecimal("50"), 10);
        System.out.println("хлеб.equals(хлеб2): " + хлеб.equals(хлеб2)); // true
    }
}
