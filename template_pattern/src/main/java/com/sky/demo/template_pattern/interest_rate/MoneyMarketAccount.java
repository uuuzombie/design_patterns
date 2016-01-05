package com.sky.demo.template_pattern.interest_rate;

/**
 * Created by rg on 2014/8/1.
 */
public class MoneyMarketAccount extends Account {

    @Override
    protected String doCalculateAccountType() {
        return "Money Marcket";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.045D;
    }
}
