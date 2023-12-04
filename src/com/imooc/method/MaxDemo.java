package com.imooc.method;

// 带参数无返回值的方法
public class MaxDemo {
    public void max(float a, float b) {
        float result = a > b ? a : b;
        System.out.println("最大值为：" + result);
    }

    public static void main(String[] args) {
        MaxDemo maxDemo = new MaxDemo();
        maxDemo.max(3.4f, 5.6f);

    }
}
