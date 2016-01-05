package com.sky.demo.template_pattern.interest_rate;

/**
 * Created by rg on 2014/8/1.
 */
public class CDAccount extends Account {

    @Override
    protected String doCalculateAccountType() {
        return "Certificate of Deposite";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.065D;
    }
}
