package com.sky.demo.finger_guess.impl;


import com.sky.demo.finger_guess.interfaces.IGameStrategy;

import java.util.Random;

/**
 * Created by rg on 2014/8/1.
 */
public class Normal implements IGameStrategy {
    @Override
    public int play(int player) {
        Random random = new Random(0);
        return random.nextInt(3) + 1;
    }
}
