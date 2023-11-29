package com.imooc.basicGrammar;

public class FinalDemo {
    public static void main(String[] args) {
        int m = 5;
        final int N = 6;
        m = 10;
        // N = 10; // 不能对final修饰的变量进行修改
    }
}