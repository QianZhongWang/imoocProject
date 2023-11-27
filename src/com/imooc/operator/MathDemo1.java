package com.imooc.operator;

public class MathDemo1 {
    public static void main(String[] args) {
        // x++ 和 ++x 的区别
        int x = 4;
        int y = (x++) + 5;
        System.out.println("x=" + x + ",y=" + y);

        x = 4;
        y = (++x) + 5;
        System.out.println("x=" + x + ",y=" + y);

        // x-- 和 --x 的区别
        x = 4;
        y = (x--) + 5;
        System.out.println("x=" + x + ",y=" + y);

        x = 4;
        y = (--x) + 5;
        System.out.println("x=" + x + ",y=" + y);
    }
}
