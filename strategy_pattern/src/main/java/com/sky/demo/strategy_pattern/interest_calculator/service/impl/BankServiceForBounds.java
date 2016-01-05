package com.sky.demo.strategy_pattern.interest_calculator.service.impl;


import com.sky.demo.strategy_pattern.interest_calculator.service.IBankService;

/**
 * Created by rg on 2014/8/1.
 */
public class BankServiceForBounds implements IBankService {
    @Override
    public void process() {
        System.out.println("Bounds");
    }
}
