package com.javalearning.module3.scheduler;

import java.time.LocalDateTime;

public class SchedulerDemo {
    public static void main(String[] args) {
        // 1. Задача на завтра
        LocalDateTime tomorrow = LocalDateTime.now().plusDays(1);
        Task task1 = new Task("Завершить отчёт", tomorrow, TaskStatus.PENDING);

        // 2. Задача на прошлую неделю (просроченная)
        LocalDateTime lastWeek = LocalDateTime.now().minusWeeks(1);
        Task task2 = new Task("Оплатить счёт", lastWeek, TaskStatus.PENDING);

        // 3. Задача на следующий месяц
        LocalDateTime nextMonth = LocalDateTime.now().plusMonths(1);
        Task task3 = new Task("Подготовить презентацию", nextMonth, TaskStatus.PENDING);

        // Выводим до проверки
        System.out.println("До проверки:");
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);

        // Проверяем и обновляем
        task1 = checkStatus(task1);
        task2 = checkStatus(task2);
        task3 = checkStatus(task3);

        // Выводим после проверки
        System.out.println("\nПосле проверки:");
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);
    }

    public static Task checkStatus(Task task) {
        LocalDateTime now = LocalDateTime.now();

        if (task.status() == TaskStatus.PENDING) {
            if (task.dueDate().isBefore(now)) {
                System.out.println("Задача \"" + task.title() + "\" просрочена!");
                return new Task(task.title(), task.dueDate(), TaskStatus.OVERDUE);
            } else {
                System.out.println("Задача \"" + task.title() + "\" ещё актуальна.");
            }
        } else if (task.status() == TaskStatus.OVERDUE) {
            System.out.println("Задача \"" + task.title() + "\" уже просрочена.");
        } else {
            System.out.println("Задача \"" + task.title() + "\" выполнена или неактивна.");
        }

        return task;
    }
}