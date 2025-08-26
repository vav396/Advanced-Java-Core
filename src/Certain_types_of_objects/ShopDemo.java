package Certain_types_of_objects;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopDemo {
    public static void main(String[] args) {
        // 1. Создай товары
        Product phone = new Product("iPhone 15", Category.PHONE, new BigDecimal("999.99"), 5);
        Product laptop = new Product("MacBook Pro", Category.LAPTOP, new BigDecimal("2399.00"), 3);
        Product tablet = new Product("iPad", Category.TABLET, new BigDecimal("499.50"), 8);
        Product cable = new Product("USB-C кабель", Category.ACCESSORY, new BigDecimal("25.00"), null);

        // 2. Добавь в список
        List<Product> products = new ArrayList<>();
        products.add(phone);
        products.add(laptop);
        products.add(tablet);
        products.add(cable);

        // 3. Выведи все товары
        System.out.println("=== Товары в магазине ===");
        for (Product p : products) {
            System.out.println(p);
        }

        // 4. Покажи разницу в точности
        System.out.println("\n=== Точность вычислений ===");
        System.out.println("0.1 + 0.2 (double): " + (0.1 + 0.2));
        System.out.println("0.1 + 0.2 (BigDecimal): " +
                new BigDecimal("0.1").add(new BigDecimal("0.2")));

        // 5. Попробуй использовать null
        System.out.println("\n=== Работа с null ===");
        Integer quantity = cable.stock(); // может быть null
        if (quantity != null) {
            System.out.println("Количество кабелей: " + quantity);
        } else {
            System.out.println("Количество кабелей: неизвестно");
        }

        // 6. Посчитай общую стоимость запасов
        BigDecimal totalValue = BigDecimal.ZERO;
        System.out.println("\n=== Стоимость запасов ===");
        for (Product p : products) {
            if (p.stock() != null && p.stock() > 0) {
                BigDecimal itemValue = p.price().multiply(BigDecimal.valueOf(p.stock()));
                System.out.println(p.name() + ": " + itemValue + " (x" + p.stock() + ")");
                totalValue = totalValue.add(itemValue);
            }
        }
        System.out.println("Общая стоимость: " + totalValue);
    }
}
