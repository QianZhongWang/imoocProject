package com.imooc.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {
    // 求整型数组的累加和
    public static void main(String[] args) {

        int[] intArray = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素");
            intArray[i] = sc.nextInt();
        }
        System.out.println("你输入的数据为" + Arrays.toString(intArray));
        int sum = 0;
        for (int j : intArray) {
            sum += j;
        }
        System.out.println("数组元素的累加和为：" + sum);
    }
}
