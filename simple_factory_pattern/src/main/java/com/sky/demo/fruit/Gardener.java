package com.sky.demo.fruit;

/**
 * Created by rg on 1/5/16.
 */
public class Gardener {

    public static Fruit getFruit(String fruit) {
        if ("apple".equalsIgnoreCase(fruit)) {
            return new Apple();
        } else if ("orange".equalsIgnoreCase(fruit)) {
            return new Orange();
        } else {
            return null;
        }
    }

    public static Fruit getFruitByReflect(String fruitPath) throws Exception {
        Class<?> c = Class.forName(fruitPath);
        return (Fruit) c.newInstance();
    }

    public static void main(String[] args) throws Exception {
        Fruit fruit0 = Gardener.getFruit("APPLE");
        fruit0.grow();

        Fruit fruit1 = Gardener.getFruit("ORANGE");
        fruit1.harvest();

        fruit0 = Gardener.getFruitByReflect("com.sky.demo.fruit.Apple");
        fruit0.grow();

        fruit1 = Gardener.getFruitByReflect("com.sky.demo.fruit.Orange");
        fruit1.harvest();
    }
}
