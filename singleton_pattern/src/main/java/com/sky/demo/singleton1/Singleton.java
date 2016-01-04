package com.sky.demo.singleton1;

/**
 * Created by rg on 2014/5/9.
 */
public class Singleton {

    public static final Singleton INSTANCE = new Singleton();

    //私有化构造函数，可防止实例化，但是可以通过反射机制修改
    private Singleton(){

    }

    public void levelTheBuilding(){

    }
}
