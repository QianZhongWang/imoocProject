package com.imooc.operator;

import java.util.Scanner;

public class LogicDemo2 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n % 3 == 0) {
            System.out.println(n + "能被3整除");
        } else {
            System.out.println(n + "不能被3整除");
        }

        int i = 9, j = 8, k = 6, m = 10;
        if (!(i > j) || m < k++) {
            k--;
        } else {
            k++;
        }
        System.out.println(k);

    }
}
