package com.sky.demo.decorator_pattern.wrapper;

/**
 * Created by user on 17/5/17.
 * 4.具体装饰
 */
public class Fish extends Decorator {

    public Fish(Sage sage) {
        super(sage);
    }

    @Override
    public void move() {
        System.out.println("fish move");
    }
}
