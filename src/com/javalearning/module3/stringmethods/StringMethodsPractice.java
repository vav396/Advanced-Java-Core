package com.javalearning.module3.stringmethods;

public class StringMethodsPractice {
    public static void main(String[] args) {
        String str = " Hello World ";

        System.out.println(str.trim());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        String text = "   Java — это круто!   ";
        text = text.trim().toUpperCase(); // "JAVA — ЭТО КРУТО!"

        System.out.println("Текст: " + text);

        System.out.println("Начинается с 'JAVA': " + text.startsWith("JAVA"));
        System.out.println("Заканчивается на 'КРУТО!': " + text.endsWith("КРУТО!"));
        System.out.println("Содержит 'ЭТО': " + text.contains("ЭТО"));
    }
}
