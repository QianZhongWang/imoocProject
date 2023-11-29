package com.imooc.array;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // 声明一个整型数组
        int[] intArray;

        // 声明一个字符串类型的数组
        String strArray[];

        // 创建数组
        intArray = new int[5];
        strArray = new String[10];

        // 声明数组的同时进行创建
        float[] floatArray = new float[4];

        // 初始化数组
        char[] chArray = {'a', 'b', 'b', 'd'};
        System.out.println("chArray数组的长度是：" + chArray.length);
        System.out.println("chArray数组的第一个元素是：" + chArray[0]);
        System.out.println(chArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(strArray));

        // 遍历数组
        for (int i = 0; i < chArray.length; i++) {
            System.out.println("数组的第" + (i + 1) + "个元素是：" + chArray[i]);
        }


    }
}
