package org.example.Behavioral.Strategy;

public class CalculateOrder {

    public double calculateOrderWithDiscount(double amount, Discount discountType){
        return discountType.calcAndApplyDiscount(amount);
    }
}
