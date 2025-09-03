package com.javalearning.module2.practice;

import java.math.BigDecimal;

public class ShopPractice {
    public static void main(String[] args) {

    Product laptop = new Product("Laptop", new BigDecimal("10000"), 5);
    Product mouse = new Product("Mouse", new BigDecimal("100"), 10);
    Product keyboard = new Product("Keyboard", new BigDecimal("200"), 15);
    Product rug = new Product("Rug", new BigDecimal("50"), null);

        Order order1 = new Order(1,laptop,1,OrderStatus.NEW);
        Order order2 = new Order(2,mouse,2,OrderStatus.SHIPPED);
        Order order3 = new Order(3, laptop, 1, OrderStatus.CANCELLED);

        System.out.println("=== Товары ===");
        System.out.println(laptop);
        System.out.println(mouse);
        System.out.println(keyboard);
        System.out.println(rug);

        System.out.println("\n=== Заказы ===");
        printOrder(order1);
        printOrder(order2);
        printOrder(order3);

        System.out.println("\n=== Активные заказы ===");
        if (order1.status() != OrderStatus.CANCELLED) printOrder(order1);
        if (order2.status() != OrderStatus.CANCELLED) printOrder(order2);
        // order3 — отменён, не выводим

        System.out.println("\n=== Самый дорогой заказ ===");
        Order[] orders = {order1, order2, order3};
        Order maxOrder = null;
        BigDecimal maxTotal = BigDecimal.ZERO;

        for (Order o : orders) {
            BigDecimal total = o.product().price().multiply(BigDecimal.valueOf(o.quantity()));
            if (o.status() != OrderStatus.CANCELLED && total.compareTo(maxTotal) > 0) {
                maxTotal = total;
                maxOrder = o;
            }
        }

        if (maxOrder != null) {
            System.out.println("Самый дорогой заказ: #" + maxOrder.orderId() + ", сумма: " + maxTotal);
        }

        System.out.println("\n=== Все статусы ===");
        for (OrderStatus status : OrderStatus.values()) {
            System.out.println(status);
        }

    }

    static void printOrder(Order order) {
        BigDecimal total = order.product().price().multiply(BigDecimal.valueOf(order.quantity()));
        System.out.println("Заказ #" + order.orderId() +
                ", Товар: " + order.product().name() +
                ", Количество: " + order.quantity() +
                ", Статус: " + order.status() +
                ", Сумма: " + total);
    }
}
