package com.imooc.array;

import java.util.Scanner;

public class ArrayTestDemo1 {
    public static void main(String[] args) {
        // 定义一个学生成绩的二维数组
        int[][] stuScore = new int[3][2];
        // 定义并赋值学科数组
        String[] courseName = {"语文", "数学"};

        Scanner sc = new Scanner(System.in);
        //定义两个变量，用于保存语文和数学的总成绩
        int sumChinese = 0, sumMath = 0;

        for (int stuIndex = 0; stuIndex < stuScore.length; stuIndex++) {
            for (int courseIndex = 0; courseIndex < stuScore[stuIndex].length; courseIndex++) {
                System.out.println("请输入第" + (stuIndex + 1) + "个学生的" + courseName[courseIndex] + "成绩：");
                stuScore[stuIndex][courseIndex] = sc.nextInt();
            }
            // 计算语文总成绩
            sumChinese += stuScore[stuIndex][0];
            // 计算数学总成绩
            sumMath += stuScore[stuIndex][1];
        }
        System.out.println("语文总成绩为：" + sumChinese);
        System.out.println("语文的平均分为：" + sumChinese / stuScore.length);
        System.out.println("数学总成绩为：" + sumMath);
        System.out.println("数学的平均分为：" + sumMath / stuScore.length);
    }
}
