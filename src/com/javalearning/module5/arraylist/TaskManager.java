package com.javalearning.module5.arraylist;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        tasks.add("Купить продукты");
        tasks.add("Сделать домашку");
        tasks.add("Позвонить другу");

        System.out.println(tasks);
        System.out.println(tasks.size());
        System.out.println(tasks.get(0));
        System.out.println(tasks.get(tasks.size() - 1));

        tasks.add(0, "Срочно: отправить отчёт");
        tasks.set(1, "Сделать домашку 2");
        tasks.remove("Позвонить другу");
        tasks.contains("Купить продукты");

        System.out.println(tasks.get(1));
        System.out.println(tasks.isEmpty());

        tasks.clear();
        System.out.println(tasks.size());
    }
}
