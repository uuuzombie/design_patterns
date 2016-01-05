package com.sky.demo.strategy_pattern.finger_guess.apply;


import com.sky.demo.strategy_pattern.finger_guess.impl.Hard;
import com.sky.demo.strategy_pattern.finger_guess.impl.Normal;
import org.junit.Test;

/**
 * Created by rg on 2014/8/1.
 */
public class FingerGuessTest {

    @Test
    public void test_Normal_strategy(){

        FingerGuess fingerGuess = new FingerGuess();
        System.out.println("Normal:");
        fingerGuess.start(new Normal());
    }

    @Test
    public void test_Hard_strategy(){
        FingerGuess fingerGuess = new FingerGuess();
        System.out.println("Hard:");
        fingerGuess.start(new Hard());
    }

}
