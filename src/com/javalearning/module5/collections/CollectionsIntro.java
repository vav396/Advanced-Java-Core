package com.javalearning.module5.collections;

import java.util.*;

public class CollectionsIntro {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("яблоко");
        fruits.add("банан");
        fruits.add("груша");
        fruits.add("банан");

        System.out.println(fruits);
        System.out.println(fruits.contains("банан"));
        System.out.println(fruits.size());
        System.out.println(fruits.get(2));

        fruits.remove("банан");
        System.out.println(fruits);

        Set<String> uniqueFruits = new HashSet<>();
        uniqueFruits.add("яблоко");
        uniqueFruits.add("банан");
        uniqueFruits.add("груша");
        uniqueFruits.add("банан");

        System.out.println(uniqueFruits);
        System.out.println(uniqueFruits.size());
        System.out.println(uniqueFruits.contains("яблоко"));

        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("яблоко", 10);
        fruitPrices.put("банан", 20);
        fruitPrices.put("груша", 30);

        System.out.println("Цена банана: " + fruitPrices.get("банан"));
        System.out.println(fruitPrices.keySet());
        System.out.println(fruitPrices.values());
        System.out.println(fruitPrices.entrySet());
    }
}
