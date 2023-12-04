package com.imooc.method;

public class DiscountDemo {

    public double getDiscountPrice(double price) {
        double discount = 1;
        if (price >= 200) {
            discount = 0.85;
        } else if (price >= 100) {
            discount = 0.95;
        }
        return price * discount;
    }

    public static void main(String[] args) {
        DiscountDemo discountDemo = new DiscountDemo();
        double price = 10;
        double discountPrice = discountDemo.getDiscountPrice(price);
        System.out.println("原价为：" + price + "  折扣价为：" + discountPrice);

    }
}
