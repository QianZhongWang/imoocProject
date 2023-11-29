package com.imooc.array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] intArray = {12, 34, 9, 21, 6};
        int max = 0;
        for (int i : intArray) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("数组中的最大值为：" + max);


    }

}
