package com.imooc.basicGrammar;

public class StringDemo {
    public static void main(String[] args) {
        // 定义一个空字符串
        String s1 = "";
        System.out.println("s1 = " + s1);

        // 定义一个字符串，内容是Hello
        String s2 = "Hello";
        System.out.println("s2 = " + s2);

        // 定义一个包含Unicode字符的字符串
        String s3 = "\u005d\u005f";
        System.out.println("s3 = " + s3);

        String s4 = "A\u005d\u005fB";
        System.out.println("s4 = " + s4);

        String s5 = " Hello Java ";
        System.out.println("s5 = " + s5);




        /*
         * 1、定义一个布尔类型的变量flag，赋值为true并输出
         * 2、定义一个字符型变量str 值为hello word，并输出
         * 3、定义一个字符串类型的str1 值为空串
         * 4、将str的值赋值给str1，并输出
         */
        boolean flag = true;
        System.out.println("flag = " + flag);
        String str = "hello word";
        System.out.println("str = " + str);
        String str1 = "";
        System.out.println("str1 = " + str1);
        str1 = str;
        System.out.println("str1 = " + str1);


    }
}
