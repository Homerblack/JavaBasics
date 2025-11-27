package src.JavaPractise.leetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanNumberConverter {

    public static void main(String[] args) {

        Map<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);

        String input = "XIV";

        int length = input.length() - 1;
        int total = 0;

        for (int i = 0; i < length; i++) {

            int current = romanMap.get(String.valueOf(input.charAt(i)));
            int next = romanMap.get(String.valueOf(input.charAt(i + 1)));
            if (current >= next) {
                total += current;
            } else {
                total -= current;
            }
        }
        total += romanMap.get(String.valueOf(input.charAt(input.length() - 1)));

        System.out.println(total);
    }

}
