package com.imooc;

public class VarDemo {
    public static void main(String[] args) {
        // 定义两个局部变量x,y;
        int x = 0, y = 0;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int x1, y1;
        x1 = 1;
        y1 = 2;
        System.out.println("x1 = " + x1);
        System.out.println("y1 = " + y1);

        // 关于换行的问题
        System.out.print(x + " " + y);
        System.out.println();
        System.out.print("\n");
        System.out.print(x + "," + y);
        System.out.println();


        // 用科学计数法表示浮点数
        double d = 1.23e5;
        System.out.println("d = " + d);
        double d1 = 1.23E-5;
        System.out.println("d1 = " + d1);
        float f = 1.23e5f;
        System.out.println("f = " + f);
        double d2 = .2;
        System.out.println("d2 = " + d2);


        /*
         * 1、定义一个整型变量n 只为98
         * 2、定义一个char类型的变量ch，将变量赋值给ch 然后输出ch的值
         * 3、定义一个长整型变量var，值为19000000000并输出
         * 4、定义一个double类型的变量d，将变量var的值赋值给d
         */

        int n = 98;
        System.out.println("n = " + n);
        char ch = (char)n;
        System.out.println("ch = " + ch);
        long var = 19000000000L;
        System.out.println("var = " + var);
        double d3 = var;
        System.out.println("d3 = " + d3);

    }
}
