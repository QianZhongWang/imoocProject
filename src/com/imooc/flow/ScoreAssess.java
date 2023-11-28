package com.imooc.flow;

import java.util.Scanner;

public class ScoreAssess {
    public static void main(String[] args) {
        /*
         * 成绩大于等于90分，输出“优秀”；
         * 成绩大于等于80分且小于90分，输出“良好”；
         * 成绩大于等于60分且小于80分，输出“及格”；
         * 成绩小于60分，输出“不及格”。
         */
        System.out.println("请输入成绩：");
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();
        if (score >= 90) {
            System.out.println("优秀");
        }
        if (score >= 80 && score < 90) {
            System.out.println("良好");
        }
        if (score >= 60 && score < 80) {
            System.out.println("及格");
        }
        if (score < 60) {
            System.out.println("不及格");
        }


        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80) {
            System.out.println("良好");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }

    }

}
