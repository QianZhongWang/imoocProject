package com.imooc.basicGrammar;

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

        /*
           testDemo
         1、定义一个float类型的变量f1,值为98.4
         2、定义一个float类型的变量f2,将f1赋值给f2
         3、定义一个整型变量n，值为55
         4、定义一个double类型的变量d1,值为555.3
         5、将n的值赋值给d1
         */

        float f1 = 98.4f;
        System.out.println("f1 = " + f1);

        float f2 = f1;
        System.out.println("f2 = " + f2);

        int n = 55;
        System.out.println("n = " + n);

        double d3 = 555.3;
        System.out.println("d3 = " + d3);

        d3 = n;
        System.out.println("赋值后d1的值为：" + d3);


    }
}
