package org.example.Behavioral.Strategy;

public class NYDiscount implements Discount {

    @Override
    public double calcAndApplyDiscount(Double amount) {
        System.out.println("Calculating discount...");
        return amount*0.85; //Discount 15%

    }
}
