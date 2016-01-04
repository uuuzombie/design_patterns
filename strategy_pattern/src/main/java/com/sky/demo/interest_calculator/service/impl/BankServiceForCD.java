package com.sky.demo.interest_calculator.service.impl;


import com.sky.demo.interest_calculator.service.IBankService;

/**
 * Created by rg on 2014/8/1.
 */
public class BankServiceForCD implements IBankService {
    @Override
    public void process() {
        System.out.println("CD");
    }
}
