package com.imooc.operator;

public class ConditionDemo {
    public static void main(String[] args) {
        // 商场打折，如果两件商品的价格大于100则减20，并把原价和折后价分别输出
        double price1 = 80, price2 = 55;

        double sum = price1 + price2;

        if (sum >= 100) {
            System.out.println("商品原价：" + sum + " 折后价：" + (sum - 20));
        } else {
            System.out.println("商品原价：" + sum + " 折后价：" + sum);
        }
    }
}
