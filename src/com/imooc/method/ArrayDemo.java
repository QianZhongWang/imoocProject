package com.imooc.method;

import java.util.Arrays;

public class ArrayDemo {
    public void updateArray(int[] a) {
        a[3] = 15;
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        ArrayDemo arrayDemo = new ArrayDemo();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("调用方法前数组" + Arrays.toString(arr));
        arrayDemo.updateArray(arr);
        System.out.println("调用方法后数组" + Arrays.toString(arr));
    }
}
