package com.imooc.operator;

public class LogicDemo {
    public static void main(String[] args) {

        char ch = 'f';

        if ('a' < ch && ch < 'z') {
            System.out.println(ch + "是a到z之间的字符");
        } else {
            System.out.println(ch + "不是a到z之间的字符");
        }
    }
}
