package org.example.Behavioral.Strategy;

public class SeasonalDiscount implements Discount {

    @Override
    public double calcAndApplyDiscount(Double amount) {
        System.out.println("Calculating discount...");
        return amount*0.5; //Discount 50%
    }
}
