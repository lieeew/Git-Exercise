package com.leikooo;

import com.leikooo.constant.AppConstants;
import com.leikooo.service.Calculator;
import com.leikooo.util.MathUtils;
import com.leikooo.util.StringUtils;

/**
 *@author <a href="https://github.com/lieeew">leikooo</a>
 *@date 2026/6/8
 *@description Git rebase 练习项目入口
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(AppConstants.APP_NAME + " v" + AppConstants.APP_VERSION);
        System.out.println("Author: " + AppConstants.AUTHOR);

        String greeting = StringUtils.capitalize("hello and welcome!");
        System.out.println(greeting);

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("sum = " + MathUtils.sum(numbers));
        System.out.println("average = " + MathUtils.average(numbers));
        System.out.println("max = " + MathUtils.max(numbers));

        Calculator calculator = new Calculator();
        System.out.println("10 + 5 = " + calculator.add(10, 5));
        System.out.println("10 / 3 = " + calculator.divide(10, 3));
    }
}
