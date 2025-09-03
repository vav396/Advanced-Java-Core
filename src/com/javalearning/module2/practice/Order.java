package com.javalearning.module2.practice;

public record Order(int orderId,
                    Product product,
                    int quantity,
                    OrderStatus status){
}
