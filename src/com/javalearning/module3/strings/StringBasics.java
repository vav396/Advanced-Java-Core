package com.javalearning.module3.strings;

public class StringBasics {
    public static void main(String[] args) {
        String text1 = "Hello";
        String text2 = "Hello";
        String text3 = new String("Hello");

        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);

        System.out.println("text1 == text2: " + (text1 == text2));
        System.out.println("text1.equals(text2): " + text1.equals(text2));
        System.out.println("text1 == text3: " + (text1 == text3));
        System.out.println("text1.equals(text3): " + text1.equals(text3));

        System.out.println(text1.length());
        System.out.println(text1.isEmpty());
        System.out.println(text1.isBlank());
        System.out.println(text1.charAt(0));
        System.out.println(text1.charAt(text1.length() - 1));
    }
}
