package com.sky.demo.observer_pattern.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by user on 17/5/15.
 * 观察者
 */
public class Watcher implements Observer {

    String data;

    public Watcher() {

    }

    public Watcher(Observable observable) {
        observable.addObserver(this);   //将主题注册到观察者
    }

    public String getData() {
        return data;
    }


    @Override
    public void update(Observable observable, Object arg) {
        this.data = ((Watched) observable).getData();
        System.out.println("watcher get data changed to " + data);
    }
}
