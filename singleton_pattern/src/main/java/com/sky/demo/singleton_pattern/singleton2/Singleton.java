package com.sky.demo.singleton_pattern.singleton2;

/**
 * Created by user on 17/5/15.
 * 懒汉式，基于私有静态内部类，线程安全
 */
public class Singleton {

    private Singleton(){}


    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static Singleton INSTANCE = new Singleton();
    }

}
