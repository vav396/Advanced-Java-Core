package com.javalearning.module2.precision;

import java.math.BigDecimal;

public class PriceCalculator {
    public static void main(String[] args) {
        System.out.println("=== Проблема double ===");
        double a = 0.1;
        double b = 0.3;
        System.out.println("a + b = " + (a + b));

        System.out.println("=== Решение с BigDecimal ===");
        BigDecimal a1 = new BigDecimal("0.1");
        BigDecimal b1 = new BigDecimal("0.3");
        System.out.println("a1 + b1 = " + a1.add(b1));

        BigDecimal item1 = new BigDecimal("19.99");
        BigDecimal item2 = new BigDecimal("5.50");

        BigDecimal totalCost = item1.multiply(BigDecimal.valueOf(3))
                .add(item2.multiply(BigDecimal.valueOf(2)));
        System.out.println("Общая стоимость: " + totalCost);

        System.out.println("\n=== Ошибка при использовании double ===");
        double d1 = 19.99;
        double d2 = 5.50;
        double badTotal = d1 * 3 + d2 * 2;
        System.out.println("Неточная стоимость: " + badTotal);
    }
}
