package com.imooc.method;

public class FacDemo {
    public int fac(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        FacDemo facDemo = new FacDemo();
        int result = facDemo.fac(5);
        System.out.println("5的阶乘为：" + result);

    }
}
