package com.imooc.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTestDemo {
    public static void main(String[] args) {
        // 定义一个二维数组
        int[][] intArray = new int[3][2];
        //
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                if (j % 2 == 0) {
                    System.out.println("请输入第" + (i + 1) + "个学生的语文成绩：");
                } else {
                    System.out.println("请输入第" + (i + 1) + "个学生的数学成绩：");
                }
                intArray[i][j] = sc.nextInt();
            }
        }
        System.out.println("你输入的成绩为：" + Arrays.deepToString(intArray));

        int sumChinese = 0;
        int sumMath = 0;
        for (int[] arr : intArray) {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    sumChinese += arr[i];
                } else {
                    sumMath += arr[i];
                }
            }
        }
        System.out.println("语文总成绩为：" + sumChinese);
        System.out.println("语文的平均分为：" + sumChinese / intArray.length);
        System.out.println("数学总成绩为：" + sumMath);
        System.out.println("数学的平均分为：" + sumMath / intArray.length);


    }
}
