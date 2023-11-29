package com.imooc.array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] intArray = {6, 9, 12, 34, 23, 21};
        for (int i : intArray) {
            if (i % 3 == 0) {
                System.out.println(i + "能被3整除");
            } else {
                System.out.println(i + "不能被3整除");
            }
        }
    }
}
