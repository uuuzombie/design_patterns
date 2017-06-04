package com.sky.demo.simple_factory_pattern.fruit;

/**
 * Created by rg on 1/5/16.
 */
public class Gardener {

    /**
     * 通过名称获取实例
     * @param fruit
     * @return
     */
    public static Fruit getFruit(String fruit) {
        if ("apple".equalsIgnoreCase(fruit)) {
            return new Apple();
        } else if ("orange".equalsIgnoreCase(fruit)) {
            return new Orange();
        } else {
            return null;
        }
    }


    /**
     * 通过反射获取实例
     * @param fruitPath
     * @return
     * @throws Exception
     */
    public static Fruit getFruitByReflect(String fruitPath) throws Exception {
        Class<?> c = Class.forName(fruitPath);
        return (Fruit) c.newInstance();
    }



    public static void main(String[] args) throws Exception {
        //方式一
        Fruit fruit0 = Gardener.getFruit("APPLE");
        fruit0.grow();

        Fruit fruit1 = Gardener.getFruit("ORANGE");
        fruit1.harvest();


        //方式二
        fruit0 = Gardener.getFruitByReflect("com.sky.demo.simple_factory_pattern.fruit.Apple");
        fruit0.grow();

        fruit1 = Gardener.getFruitByReflect("com.sky.demo.simple_factory_pattern.fruit.Orange");
        fruit1.harvest();
    }
}
