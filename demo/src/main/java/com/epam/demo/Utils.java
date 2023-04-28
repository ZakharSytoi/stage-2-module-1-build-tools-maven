package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String i : args) {
            if (Integer.parseInt(i) < 0) return false;
        }
        return true;
    }
}