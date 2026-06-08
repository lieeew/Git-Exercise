package com.leikooo.service;

import com.leikooo.util.MathUtils;

/**
 * 简单计算器服务
 */
public class Calculator {

    public int add(int a, int b) {
        return MathUtils.sum(a, b);
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("除数不能为零");
        }
        return (double) a / b;
    }
}
