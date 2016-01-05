package com.sky.demo.strategy_pattern.interest_calculator.apply;


import com.sky.demo.strategy_pattern.interest_calculator.impl.BoundsCalculator;
import com.sky.demo.strategy_pattern.interest_calculator.service.BankServiceFactory;
import com.sky.demo.strategy_pattern.interest_calculator.service.IBankService;
import org.junit.Test;

/**
 * Created by rg on 2014/8/1.
 */
public class BankingProductTest {


    @Test
    public void test_BankingProduct(){

        BankingProduct bankingProduct = new BankingProduct();

        bankingProduct.setProductName("CD");
        bankingProduct.setiInterestCalculator(new BoundsCalculator());
        bankingProduct.calculateInterest();
    }

    @Test
    public void test_BankService(){

        IBankService bankService = BankServiceFactory.getInstance().buildBankService("CD");
        bankService.process();
    }

}
