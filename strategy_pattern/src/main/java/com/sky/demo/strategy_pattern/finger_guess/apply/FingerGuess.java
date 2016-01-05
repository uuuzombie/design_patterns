package com.sky.demo.strategy_pattern.finger_guess.apply;


import com.sky.demo.strategy_pattern.finger_guess.impl.Hard;
import com.sky.demo.strategy_pattern.finger_guess.impl.Normal;
import com.sky.demo.strategy_pattern.finger_guess.interfaces.IGameStrategy;

import java.util.Scanner;

/**
 * Created by rg on 2014/8/1.
 */
public class FingerGuess {

    Scanner playerScanner = new Scanner(System.in);

    public String toString(int finger) {
        switch (finger) {
        case 1:
            return "石头";
        case 2:
            return "剪刀";
        case 3:
            return "布";
        default:
            return "错误！";
        }
    }

    public void start(IGameStrategy comStrategy) {
        boolean gameOver = false;
        while (!gameOver) {
            System.out.println("请出拳(按回车确认)：1、石头；2、剪刀；3、布");
            int playerChoice = 0;
            while (playerChoice <= 0 || playerChoice > 4) {
                playerChoice = playerScanner.nextInt();
            }
            int comChoice = comStrategy.play(playerChoice);
            System.out.printf("你出的是%s，计算机出的是%s\n", toString(playerChoice), toString(comChoice));
            if (playerChoice == comChoice) {
                System.out.println("平局");
            } else if (playerChoice + 1 == comChoice || playerChoice - 2 == comChoice) {
                System.out.println("恭喜你获胜了！");
                gameOver = true;
            } else {
                System.out.println("很遗憾你失败了！");
                gameOver = true;
            }
        }
    }


    public static void main(String[] args) {
        FingerGuess fingerGuess = new FingerGuess();
        System.out.println("Normal:");
        fingerGuess.start((IGameStrategy) new Normal());

        System.out.println("Hard:");
        fingerGuess.start((IGameStrategy) new Hard());
    }
}
