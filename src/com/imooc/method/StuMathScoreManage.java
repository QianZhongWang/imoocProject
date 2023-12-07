package com.imooc.method;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 处理学生数学成绩的类
 */
public class StuMathScoreManage {
    /**
     * 显示操作菜单
     */
    public void displayMenu() {
        System.out.println("***************************************");
        System.out.println("        1--初始化数学成绩");
        System.out.println("        2--求成绩的平均值");
        System.out.println("        3--统计成绩大于85分的人数");
        System.out.println("        4--修改指定位置处的成绩");
        System.out.println("        5--打印输出所有成绩");
        System.out.println("        0--退出");
        System.out.println("***************************************");
        System.out.println("请输入对应的数字进行操作");
    }

    /**
     * 初始化数学成绩的方法
     *
     * @return 数学成绩
     */
    public float[] initScore() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要存储的学生成绩的数量：");
        int stuNum;
        // 判断输入的是否为数字
        while (true) {
            try {
                stuNum = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("输入的不是数字,请重新输入要存储的学生成绩的数量：");
                sc.next();
            }
        }
        // 创建数组
        float[] scores = new float[stuNum];
        // 为数组赋值
        for (int i = 0; i < stuNum; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的成绩：");
            try {
                scores[i] = sc.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("输入的不是数字,请重新输入第" + (i + 1) + "个学生的成绩：");
                sc.next();
                i--;
            }
        }

        return scores;
    }

    /**
     * 求成绩的平均值
     *
     * @param scores 数学成绩数组
     * @return 平均值
     */
    public float average(float[] scores) {
        float sum = 0;
        if (scores == null) {
            System.out.println("还没有初始化成绩！");
            return sum;
        }
        for (float score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    /**
     * 统计成绩大于85分的人数
     *
     * @param scores 数学成绩数组
     * @return 大于85分的人数
     */
    public int count(float[] scores) {
        int count = 0;
        if (scores == null) {
            System.out.println("还没有初始化成绩！");
            return count;
        }
        for (float score : scores) {
            if (score > 85) {
                count++;
            }
        }
        return count;
    }

    /**
     * 更新指定位置的学生成绩
     *
     * @param scores   数学成绩数组
     * @param index    数组下标
     * @param newScore 新的成绩
     */
    public void update(float[] scores, int index, float newScore) {
        if (scores == null) {
            System.out.println("还没有初始化成绩！");
            return;
        }
        if (index < 0 || index > scores.length - 1) {
            System.out.println("数组下标越界！");
            return;
        }
        scores[index] = newScore;
    }


    public void displayAllScores(float[] scores) {
        if (scores == null) {
            System.out.println("还没有初始化成绩！");
            return;
        }
        String str = "";
        for (float score : scores) {
            str += score + " ";
        }
        System.out.println("成绩为" + str);
    }


    /**
     * @param args args
     */
    public static void main(String[] args) {
        StuMathScoreManage stuMathScoreManage = new StuMathScoreManage();
        Scanner sc = new Scanner(System.in);
        float[] scores = null; // 数学成绩数组
        int inputType; // 输入的数字
        float average; // 平均成绩

        while (true) {
            // 显示菜单
            stuMathScoreManage.displayMenu();


            // 判断输入的是否为数字
            try {
                inputType = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("输入的不是数字");
                sc.next();
                continue;
            }

            // 当输入的数字为0时，退出程序(while循环)
            if (inputType == 0) {
                System.out.println("退出程序！");
                break;
            }

            switch (inputType) {
                case 1:
                    scores = stuMathScoreManage.initScore();
                    break;
                case 2:
                    average = stuMathScoreManage.average(scores);
                    System.out.println(average != 0 ? "数学平均成绩为：" + average : "  ");
                    break;
                case 3:
                    int count = stuMathScoreManage.count(scores);
                    System.out.println("成绩大于85分的人数为：" + count);
                    break;
                case 4:
                    int index;
                    float newScore;
                    if (scores==null){
                        System.out.println("请初始化成绩");
                    }
                    System.out.println("修改前：");
                    stuMathScoreManage.displayAllScores(scores);
                    try {
                        System.out.println("请输入要修改的学生的序号：");
                        index = sc.nextInt();
                        System.out.println("请输入新的成绩：");
                        newScore = sc.nextFloat();

                    } catch (InputMismatchException e) {
                        System.out.println("输入的不是数字");
                        sc.next();
                        continue;
                    }
                    stuMathScoreManage.update(scores, index, newScore);
                    System.out.println("修改后：");
                    stuMathScoreManage.displayAllScores(scores);


                    break;
                case 5:
                    stuMathScoreManage.displayAllScores(scores);
                    break;
                default:
                    System.out.println("输入的数字不正确，请重新输入！");
                    break;

            }

        }


    }
}
