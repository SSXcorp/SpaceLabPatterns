package org.example.Behavioral.Strategy;

public class Main {
    public static void main(String[] args) {
        Discount discountNY = new NYDiscount();
        Discount discountSeasonal = new SeasonalDiscount();
        CalculateOrder calculateOrder = new CalculateOrder();

        double orderPrice = calculateOrder.calculateOrderWithDiscount(500.0,discountNY);

        System.out.println("Your order price with NYDiscount : " + orderPrice);

        orderPrice = calculateOrder.calculateOrderWithDiscount(500.0,discountSeasonal);

        System.out.println("Your order price with Seasonal Discount : " + orderPrice);

    }
}
