package com.imooc.method;

public class ArgsDemo1 {
    // 两个参数的可变参数，可变参数必须放在后面

    public void search(int n, int... arr) {
        boolean flag = false;
        for (int a : arr) {
            if (a == n) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("找不到了: " + n);
        } else {
            System.out.println("没找到: " + n);
        }
    }

    public static void main(String[] args) {
        ArgsDemo1 argsDemo1 = new ArgsDemo1();
        argsDemo1.search(1, 1, 2, 3);
        argsDemo1.search(1, 2, 3, 4);

        // 可以将数组传递给可变参数列表
        int[] a = {1, 2, 3, 4, 5};
        argsDemo1.search(1, a);
    }
}
