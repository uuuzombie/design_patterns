package com.sky.demo.simple_factory_pattern.fruit;

/**
 * Created by rg on 1/5/16.
 */
public class Orange implements Fruit {
    @Override
    public void grow() {
        System.out.println("orange.grow");
    }

    @Override
    public void harvest() {
        System.out.println("orange.harvest");
    }

    @Override
    public void plant() {
        System.out.println("orange.plant");
    }
}
