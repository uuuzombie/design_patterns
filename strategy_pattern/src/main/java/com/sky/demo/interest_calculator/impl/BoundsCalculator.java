package com.sky.demo.interest_calculator.impl;


import com.sky.demo.interest_calculator.interfaces.IInterestCalculator;

/**
 * Created by rg on 2014/8/1.
 */
public class BoundsCalculator implements IInterestCalculator {
    @Override
    public double calculate() {
        return 0.20D;
    }
}
