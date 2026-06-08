package com.leikooo.util;

/**
 * 数学工具类
 */
public class MathUtils {

    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static double average(int... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        return (double) sum(numbers) / numbers.length;
    }

    public static int max(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("numbers must not be empty");
        }
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
