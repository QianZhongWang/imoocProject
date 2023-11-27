package com.imooc;

public class FloatDemo {
    public static void main(String[] args) {
        // 定义一个单精度浮点型变量，存放1234.328
        float f = 1234.328f; // float类型的数据结尾要加f,结尾不加f的话，编译器会认为是double类型
        System.out.println("f = " + f);

        // 定义一个双精度浮点类型变量，存放5623.465
        double d = 5623.465;
        System.out.println("d = " + d);

        // 将整型赋值给浮点型
        double d1 = 123;
        System.out.println("d1 = " + d1);

        // 变量之间的赋值
        double d2 = d;
        System.out.println("d2 = " + d2);
    }
}
