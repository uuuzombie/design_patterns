package com.sky.demo.singleton_pattern.singleton4;

/**
 * Created by rg on 04/06/2017.
 * 懒汉式单例
 */
public class Singleton {

    private static Singleton INSTANCE = null;

    private Singleton() {}

    //懒汉式单例 需要加锁，否则是非线程安全的
    public synchronized static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

}
