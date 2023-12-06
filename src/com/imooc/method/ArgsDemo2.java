package com.imooc.method;


/**
 * 关于可变参数列表和重载的问题
 *
 * @author QianZW
 * @version 1.0.0
 */
public class ArgsDemo2 {
    // 可变参数列表所在的方法是最后被访问的
    public int plus(int a, int b) {
        System.out.println("不带可变参数的方法被执行了");
        return a + b;
    }

    public int plus(int... a) {
        System.out.println("带可变参数的方法执行了");
        int sum = 0;
        for (int n : a) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArgsDemo2 argsDemo2 = new ArgsDemo2();
        System.out.println("和为：" + argsDemo2.plus(1, 2));
        System.out.println("和为：" + argsDemo2.plus(1, 2, 3));
    }
}
