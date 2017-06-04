package com.sky.demo.decorator_pattern.wrapper;

/**
 * Created by user on 17/5/17.
 * 4.具体装饰
 */
public class Bird extends Decorator {

    public Bird(Sage sage) {
        super(sage);
    }

    @Override
    public void move() {
        System.out.println("bird move");
    }
}
