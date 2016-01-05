package com.sky.demo.template_pattern.interest_rate;

/**
 * Created by rg on 2014/8/1.
 */
public abstract class Account {

    protected String accountNumber;

    public Account() {
    }

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    //基本方法留给子类实现
    protected abstract String doCalculateAccountType();
    protected abstract double doCalculateInterestRate();


    //基本方法，已经实现
    public final double calculateAmount(String accountType,String accountNumber){
        //retrieve amount from database...here is only a mock-up
        return 1000.00D;
    }

    public final double calculateInterest(){
        double interestRate = doCalculateInterestRate();
        String accountType = doCalculateAccountType();
        double amount = calculateAmount(accountType,accountNumber);

        return amount * interestRate;
    }
}
