package com.sky.demo.strategy_pattern.finger_guess.impl;


import com.sky.demo.strategy_pattern.finger_guess.interfaces.IGameStrategy;

/**
 * Created by rg on 2014/8/1.
 */
public class Hard implements IGameStrategy {
    @Override
    public int play(int player) {

        switch (player){
            case 1:
                return 3;
            case 2:
                return 1;
            case 3:
                return 2;
            default:
                return 1;
        }
    }
}
