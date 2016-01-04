package com.sky.demo.interest_calculator.service;


import com.sky.demo.interest_calculator.service.impl.BankServiceForBounds;
import com.sky.demo.interest_calculator.service.impl.BankServiceForCD;

/**
 * Created by rg on 2014/8/1.
 */
public class BankServiceFactory {

    //单例模式
    private static BankServiceFactory INSTANCE = new BankServiceFactory();

    private BankServiceFactory() {
    }

    //静态工厂方法
    public static BankServiceFactory getInstance(){
        return INSTANCE;
    }


    //工厂模式
    public IBankService buildBankService(String name){

        IBankService bankService = null;
        if (name.equals("CD")){
            bankService = new BankServiceForCD();
        } else if (name.equals("Bounds")) {
            bankService = new BankServiceForBounds();
        }
        return bankService;
    }

}
