package com.sky.demo.decorator_pattern.wrapper;

/**
 * Created by user on 17/5/17.
 * 2.具体构件角色
 */
public class Mokey implements Sage {

    @Override
    public void move() {
        System.out.println("monkey move");
    }
}
