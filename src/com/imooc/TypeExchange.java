package com.imooc;

public class TypeExchange {
    public static void main(String[] args) {
        // char类型和int类型之间的转换
        char c = (char) 65536;
        System.out.println("c = " + c);
        int n;
        n = c; // char类型可以自动转换为int类型 隐式类型转换
        c = (char) n;
        System.out.println("c = " + c);

        // 整型和浮点型的类型转换问题
        int x = 100;
        long y = x;
        x = (int) y;


        float f = 100000000000000L;
        System.out.println("f = " + f);
        float f1 = 3.141592688999f;// 可能存在精度损失
        System.out.println("f1 = " + f1);


    }
}
