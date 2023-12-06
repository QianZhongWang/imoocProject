package com.imooc.method;

public class ArgsDemo {
    // 可变参数
    public void sum(int... n) {
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        System.out.println("sum=" + sum);

    }

    public static void main(String[] args) {
        ArgsDemo argsDemo = new ArgsDemo();
        argsDemo.sum(1);
        argsDemo.sum(1, 2, 3);

    }
}
