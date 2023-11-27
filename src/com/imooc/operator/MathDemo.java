package com.imooc.operator;

public class MathDemo {
    public static void main(String[] args) {
        int num1 = 10,num2 = 5;
        int result;
        // 加法
        result = num1 + num2;
        System.out.println("加法结果：" + result);

        // 减法
        result = num1 - num2;
        System.out.println("减法结果：" + result);

        // 乘法
        result = num1 * num2;
        System.out.println("乘法结果：" + result);

        // 除法
        result = num1 / num2;
        System.out.println("除法结果：" + result);
        // 分子分母都是整型的时候，得到的结果是整除后的结果，会把小数部分去掉

        // 取余
        result = 13 % num2;
        System.out.println("取余结果：" + result);

    }
}
