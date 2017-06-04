package com.sky.demo.decorator_pattern.wrapper;

/**
 * Created by user on 17/5/17.
 * 3.装饰者
 */
public class Decorator implements Sage {

    private Sage sage;

    public Decorator(Sage sage) {
        this.sage = sage;
    }

    @Override
    public void move() {
        sage.move();
    }
}
