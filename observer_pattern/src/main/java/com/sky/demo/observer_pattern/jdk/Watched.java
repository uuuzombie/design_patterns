package com.sky.demo.observer_pattern.jdk;

import java.util.Observable;

/**
 * Created by user on 17/5/15.
 * 主题，即被观察者
 */
public class Watched extends Observable {

    private String data = "";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if (this.data != data) {
            this.data = data;
            setChanged();
        }

        notifyObservers(); //通知观察者
    }
}
