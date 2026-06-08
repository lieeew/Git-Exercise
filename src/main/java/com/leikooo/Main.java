package com.leikooo;

import com.leikooo.util.MathUtils;
import com.leikooo.util.StringUtils;

/**
 *@author <a href="https://github.com/lieeew">leikooo</a>
 *@date 2026/6/8
 *@description Git rebase 练习项目入口
 */
public class Main {
    public static void main(String[] args) {
        String greeting = StringUtils.capitalize("hello and welcome!");
        System.out.println(greeting);

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("sum = " + MathUtils.sum(numbers));
        System.out.println("average = " + MathUtils.average(numbers));
        System.out.println("max = " + MathUtils.max(numbers));
    }
}
