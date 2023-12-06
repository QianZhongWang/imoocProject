package com.imooc.method;

public class AreaDemo {
    // 方法的重载，当方法名相同时，通过参数的个数、类型、顺序进行区分

    // 求圆的面积
    public double getArea(double r) {
        return Math.PI * r * r;
    }

    //  求矩形的面积
    public double getArea(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {
        double r = 4.5;
        double width = 4.2, height = 3.3;

        AreaDemo areaDemo = new AreaDemo();

        // 调用方法求圆的面积
        double circleArea = areaDemo.getArea(r);
        System.out.println("圆的面积为：" + circleArea);
        double rectangleArea = areaDemo.getArea(width, height);
        System.out.println("矩形的面积为：" + rectangleArea);

    }
}
