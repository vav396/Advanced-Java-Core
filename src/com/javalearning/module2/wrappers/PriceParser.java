package com.javalearning.module2.wrappers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PriceParser {
    public static void main(String[] args) {
        List<String> prices = Arrays.asList("100", "200", "abc", "unknown", "300");
        List<Integer> parsed = new ArrayList<>();
        for (String p : prices) {
            parsed.add(parsePrice(p));
        }
        System.out.println(parsed); // [100, 200, null, null, 300]
    }

    public static Integer parsePrice(String priceStr) {
        if (priceStr == null || priceStr.isEmpty()) {
            return null;
        } else {
            return Integer.parseInt(priceStr);
        }
    }
}
