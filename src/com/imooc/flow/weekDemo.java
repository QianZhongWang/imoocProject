package com.imooc.flow;

import java.util.Scanner;

public class weekDemo {
    public static void main(String[] args) {
        System.out.println("请输入1-7的之间的整数：");
        Scanner s = new Scanner(System.in);
        int week = s.nextInt();

        switch (week) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
            default:
                System.out.println("输入错误");
        }
    }
}
