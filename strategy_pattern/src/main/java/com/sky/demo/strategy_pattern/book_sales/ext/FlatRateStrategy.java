package com.sky.demo.strategy_pattern.book_sales.ext;


import com.sky.demo.strategy_pattern.book_sales.abs.DiscountStrategy;

/**
 * Created by rg on 2014/8/1.
 */
public class FlatRateStrategy extends DiscountStrategy {

    private double amount;
    private double price = 0;
    private int copies = 0;

    public FlatRateStrategy(double price, int copies) {
        this.price = price;
        this.copies = copies;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public double calculateDiscount() {
        return copies * amount;
    }
}
