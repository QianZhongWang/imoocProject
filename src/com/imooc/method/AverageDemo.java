package com.imooc.method;

public class AverageDemo {
    public float average(float[] arr) {
        float sum = 0;
        for (float n : arr) {
            sum += n;
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        AverageDemo getAverage = new AverageDemo();
        float[] arr = {78.5f, 98.5f, 65.5f, 32.5f, 75.5f};
        float average = getAverage.average(arr);
        System.out.println("平均成绩为：" + average);
    }
}
