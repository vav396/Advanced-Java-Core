package com.javalearning.module2.enums;

public class EnumDemo {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.NEW;
        System.out.println(status);

        // Сделай цикл по всем статусам (используй OrderStatus.values())
        for (OrderStatus orderStatus : OrderStatus.values()) {
            System.out.println(orderStatus);
        }
    }
}
