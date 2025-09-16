package com.javalearning.module5.linkedlist;

import java.util.LinkedList;

public class PriorityTaskManager {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Обычная:прочитать статью");
        tasks.add("Обычная: позвонить маме");
        tasks.addFirst("Срочная: Позвонить врачу");
        tasks.addFirst(" Срочная: отправить отчёт");

        System.out.println("Список задач:" + tasks);
        System.out.println("Первая задача: " + tasks.getFirst());
        System.out.println("Последняя задача: " + tasks.getLast());

        System.out.println("Выполнено: " + tasks.removeFirst());

        tasks.addFirst("Срочно: ответить на письмо");
        System.out.println("Список задач:" + tasks);
        System.out.println("Размер списка: " + tasks.size());

        System.out.println("индекс: " + tasks.indexOf("Обычная: позвонить маме"));
        System.out.println("Задача по индексу 1: " + tasks.get(1));
    }
}
