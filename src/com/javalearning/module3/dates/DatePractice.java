package com.javalearning.module3.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatePractice {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDate birthday = LocalDate.of(1996, 11, 25);
        System.out.println(birthday);

        LocalDateTime birthdayTime = LocalDateTime.of(1996, 11, 25, 12, 30);
        System.out.println(birthdayTime);

        // Добавь 7 дней к текущей дате
        LocalDate nextWeek = date.plusDays(7);
        System.out.println("Через 7 дней: " + nextWeek);

// Добавь 2 часа к текущему времени
        LocalTime later = time.plusHours(2);
        System.out.println("Через 2 часа: " + later);

// Вычти 1 месяц из даты рождения
        LocalDate birthdayMinusMonth = birthday.minusMonths(1);
        System.out.println("Дата рождения минус месяц: " + birthdayMinusMonth);

        // Сравни дату рождения и сегодня
        if (birthday.isBefore(date)) {
            System.out.println("Дата рождения была раньше");
        } else if (birthday.isAfter(date)) {
            System.out.println("Дата рождения ещё впереди");
        } else {
            System.out.println("Сегодня день рождения!");
        }

// Сравни дату встречи и текущее время
        if (birthdayTime.isBefore(dateTime)) {
            System.out.println("Встреча уже прошла");
        } else {
            System.out.println("Встреча ещё впереди");
        }


// Формат: dd-MM-yyyy
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Дата рождения (формат): " + birthday.format(dateFormatter));

// Формат: HH:mm:ss
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Время встречи (формат): " + birthdayTime.format(timeFormatter));
    }
}
