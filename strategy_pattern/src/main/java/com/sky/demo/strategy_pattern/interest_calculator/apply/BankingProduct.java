package com.sky.demo.strategy_pattern.interest_calculator.apply;


import com.sky.demo.strategy_pattern.interest_calculator.interfaces.IInterestCalculator;

/**
 * Created by rg on 2014/8/1.
 */
public class BankingProduct {

    private String productName;

    private IInterestCalculator iInterestCalculator;

    public BankingProduct() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public IInterestCalculator getiInterestCalculator() {
        return iInterestCalculator;
    }

    public void setiInterestCalculator(IInterestCalculator iInterestCalculator) {
        this.iInterestCalculator = iInterestCalculator;
    }

    public void calculateInterest(){

        double interest = iInterestCalculator.calculate();
        System.out.println(interest);
    }


}
