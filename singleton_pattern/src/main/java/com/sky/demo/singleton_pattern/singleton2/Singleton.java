package com.sky.demo.singleton_pattern.singleton2;

/**
 * Created by rg on 04/06/2017.
 * 懒汉式单例，使用内部类实现延迟加载 thread-safe
 */
public class Singleton {


    private Singleton() {}


    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }


    private static class SingletonHolder {

        private static Singleton INSTANCE = new Singleton();

    }

}
