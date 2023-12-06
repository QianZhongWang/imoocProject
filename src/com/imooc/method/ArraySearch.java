package com.imooc.method;

public class ArraySearch {
    public boolean search(int[] arr,int target){
        boolean flag = false;
        for (int n : arr) {
            if (n == target) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        ArraySearch arraySearch = new ArraySearch();
        int[] arr = {5, 8, 9, 6, 4, 1};
        boolean flag = arraySearch.search(arr, 10);
        if (flag) {
            System.out.println("找到了目标元素");
        } else {
            System.out.println("没有找到目标元素");
        }
    }
}
