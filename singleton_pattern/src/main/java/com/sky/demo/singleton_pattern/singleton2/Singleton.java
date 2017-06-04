package com.sky.demo.singleton_pattern.singleton2;

/**
 * Created by rg on 2014/5/9.
 * 饿汉式单例
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    //私有的构造方法
    private Singleton(){
    }

    //公有静态工厂方法
    public static Singleton getInstance(){
        return INSTANCE;
    }


    public void levelTheBuilding(){

    }

}
