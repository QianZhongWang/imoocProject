package com.imooc.basicGrammar;

public class CharDemo {
    public static void main(String[] args) {
        // 定义一个变量存放字符'a'
        char a = 'a';
        System.out.println("a = " + a);

        char ch = 65;
        System.out.println("ch = " + ch);
        // 整型可以与字符型进行转换的，整型对应的ASCII码值就是对应的字符


        /*
        * 1、定义一个字符型变量c 赋值为'S'并输出
        * 2、定义一个字符型变量c1 赋值为78并输出
        * */
        char c = 'S';
        System.out.println("c = " + c);
        char c1 = 78;
        System.out.println("c1 = " + c1);


        char ch1 = 65535;
        System.out.println("ch1 = " + ch1);

        // 如果字面量超出了char类型所表示的数据范围，需要进行强制类型转换
        char ch2 = (char)65536;
        System.out.println("ch2 = " + ch2);



        /*
          Unicode编码表
         */
        // 定义变量存放unicode编码表示的字符
        char c2 = '\u005d';
        System.out.println("c2 = " + c2);




    }
}
