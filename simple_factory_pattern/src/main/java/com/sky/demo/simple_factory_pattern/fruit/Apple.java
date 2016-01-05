package com.sky.demo.simple_factory_pattern.fruit;

/**
 * Created by rg on 1/5/16.
 */
public class Apple implements Fruit {
    @Override
    public void grow() {
        System.out.println("apple.grow");
    }

    @Override
    public void harvest() {
        System.out.println("apple.harvest");
    }

    @Override
    public void plant() {
        System.out.println("apple.plant");
    }
}
