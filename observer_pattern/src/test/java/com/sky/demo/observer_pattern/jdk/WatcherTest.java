package com.sky.demo.observer_pattern.jdk;

import org.junit.Test;

/**
 * Created by user on 17/5/15.
 */
public class WatcherTest {


    @Test
    public void test_update() throws InterruptedException {

        Watched watched = new Watched();

        Watcher watcher1 = new Watcher();
        Watcher watcher2 = new Watcher();
        watched.addObserver(watcher1);      //注册到观察者上
        watched.addObserver(watcher2);      //注册到观察者上

        Watcher watcher3 = new Watcher(watched);  //注册到观察者上
        Watcher watcher4 = new Watcher(watched);  //注册到观察者上

        watched.setData("start");
        Thread.sleep(2000);

        watched.setData("suspend");
        Thread.sleep(1000);

        watched.setData("close");
    }

}
