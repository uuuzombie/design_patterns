package com.sky.demo.strategy_pattern.book_sales.ext;


import com.sky.demo.strategy_pattern.book_sales.abs.DiscountStrategy;

/**
 * Created by rg on 2014/8/1.
 */
public class PercentageStrategy extends DiscountStrategy {

    private double percent = 0.0;

    private double price = 0.0;
    private int copies = 0;

    public PercentageStrategy(double price, int copies) {
        this.price = price;
        this.copies = copies;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public double calculateDiscount() {
        return percent * copies * price;
    }
}
