package com.imooc.array;

import java.util.Arrays;

public class ArrayDemo4 {
    public static void main(String[] args) {
        // 二维数组声明

        /*
         * 三种形式
         */
        // 声明int类型的二维数组
        int[][] intArr;
        // 声明float类型的二维数组
        float floatArr[][];
        // 声明double类型的二维数组
        double[] doubleArr[];

        // 创建一个3行4列的二维数组
        intArr = new int[3][4];
        // 输出intArr的的默认值
        System.out.println("intArr数组的默认值为：" + Arrays.deepToString(intArr));
        // 为第二行第三个元素赋值为9
        intArr[1][2] = 9;



        /*
         * 声明的时候同时创建
         */
        char[][] chArr = new char[3][4];
        // 创建一个float类型数组时，只指定行数
        float[][] floatArray = new float[3][];
        System.out.println("floatArray数组的默认值为：" + Arrays.deepToString(floatArray));
        // 这时候如果直接输出floatArray[3][0]会报错，因为floatArray[0]还没有指向任何的数组
//         System.out.println("floatArray数组的第一个元素为：" + floatArray[1][0]);
        // 为floatArray[0]指向一个长度为4的float类型的数组
        floatArray[0] = new float[4];
        // 为floatArray[1]指向一个长度为2的float类型的数组
        floatArray[1] = new float[2];
        // 为floatArray[2]指向一个长度为3的float类型的数组
        floatArray[2] = new float[3];
        System.out.println("floatArray数组的默认值为：" + Arrays.deepToString(floatArray));


        /*
         * 二维数组初始化
         */
        int[][] intArr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("intArr1数组的第一行第一列为：" + intArr1[0][0]);

        // 使用增强型for循环遍历二维数组
        for (int[] arr : intArr1) {
            for (int e : arr) {
                System.out.print(e + " ");
            }
        }


    }
}
