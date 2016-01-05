package com.sky.demo.template_pattern.interest_rate;

import org.junit.Test;

/**
 * Created by rg on 2014/8/1.
 */
public class AccountTest {

    private Account account = null;


    @Test
    public void test_Account(){

        account = new MoneyMarketAccount();
        System.out.println("earned from Money Market account = " + account.calculateInterest());

        account = new CDAccount();
        System.out.println("earned from CD account = " + account.calculateInterest());

    }
}
