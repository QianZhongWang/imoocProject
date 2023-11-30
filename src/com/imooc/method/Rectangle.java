package com.imooc.method;

public class Rectangle {
    // 求长方形面积的方法 无参有返回值
    public int getArea() {
        int length = 5;
        int width = 4;
        return length * width;
    }



    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        int area = rectangle.getArea();
        System.out.println("长方形的面积为：" + area);
    }
}
