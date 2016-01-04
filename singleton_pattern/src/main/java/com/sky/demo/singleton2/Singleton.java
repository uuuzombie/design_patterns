package com.sky.demo.singleton2;

/**
 * Created by rg on 2014/5/9.
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton(){

    }

    //公有静态工厂方法
    public static Singleton getInstance(){
        return INSTANCE;
    }


    public void levelTheBuilding(){

    }

}
