package com.sky.demo.observer_pattern.pattern;

/**
 * Created by user on 17/5/15.
 * 具体主题角色
 */
public class ConcreteObserver implements Observer {

    private String obstate;

    @Override
    public void update(String state) {
        obstate = state;
        System.out.println("observer receive state : " + state);
    }
}
