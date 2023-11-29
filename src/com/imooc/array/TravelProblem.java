package com.imooc.array;

import java.util.Arrays;
import java.util.Scanner;

public class TravelProblem {
    public static void main(String[] args) {
        String[] strArr = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < strArr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个旅游目的地：");
            strArr[i] = sc.next();
        }
        System.out.println("您输入的旅游目的地为：" + Arrays.toString(strArr));
        int randomIndex = (int) (Math.random() * 5);
        System.out.println(randomIndex);
        System.out.println("本次旅游目的地为：" + strArr[randomIndex]);


    }
}
