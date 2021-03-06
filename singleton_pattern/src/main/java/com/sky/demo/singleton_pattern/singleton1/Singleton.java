package com.sky.demo.singleton_pattern.singleton1;

/**
 * Created by rg on 2014/5/9.
 * 饿汉式，线程安全
 */
public class Singleton {

    public static Singleton INSTANCE = new Singleton();

    //私有化构造函数，可防止实例化，但是可以通过反射机制修改
    private Singleton() {}

    //公有静态工厂方法
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
