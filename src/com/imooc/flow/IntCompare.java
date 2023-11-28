package com.imooc.flow;

public class IntCompare {
    public static void main(String[] args) {
        System.out.println("请输入两个整数，程序将判断两个整数的大小关系：");
        java.util.Scanner s = new java.util.Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a > b) {
            System.out.println(a + "大于" + b);
        }
        if (a < b) {
            System.out.println(a + "小于" + b);
        }
        if (a == b) {
            System.out.println(a + "等于" + b);
        }

        if (a != b) {
            if(a>b){
                System.out.println(a + "大于" + b);
            }else {
                System.out.println(a + "小于" + b);
            }
        }else{
            System.out.println(a + "等于" + b);
        }
    }

}
