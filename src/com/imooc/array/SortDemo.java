package com.imooc.array;

import java.util.Arrays;

public class SortDemo {
    public static void main(String[] args) {
        int[] intArray = {34, 52, 12, 32, 56, 17};
        System.out.println("排序前数组元素为：" + Arrays.toString(intArray));

        int temp;
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - 1 - i; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
            System.out.println("第" + (i + 1) + "次排序后的数组元素为：" + Arrays.toString(intArray));
        }
        System.out.println("排序后的数组元素为：" + Arrays.toString(intArray));


        char[] charArray = {'a', 'f', 'b', 'c', 'A', 'E', 'A'};
        int sum = 0;
        for (char ch : charArray) {
            if (ch == 'a' || ch == 'A') {
                sum++;
            }
        }
        System.out.println("字符数组中'a'和'A'的个数为：" + sum);


    }
}
