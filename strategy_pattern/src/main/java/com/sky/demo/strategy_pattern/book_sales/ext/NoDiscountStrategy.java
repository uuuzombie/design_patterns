package com.sky.demo.strategy_pattern.book_sales.ext;


import com.sky.demo.strategy_pattern.book_sales.abs.DiscountStrategy;

/**
 * Created by rg on 2014/8/1.
 */
public class NoDiscountStrategy extends DiscountStrategy {

    private double price  = 0.0;
    private int copies = 0;

    public NoDiscountStrategy(double price, int copies) {
        this.price = price;
        this.copies = copies;
    }

    @Override
    public double calculateDiscount() {
        return 0.0;
    }
}
