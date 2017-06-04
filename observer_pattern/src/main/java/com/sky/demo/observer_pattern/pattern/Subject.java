package com.sky.demo.observer_pattern.pattern;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by user on 17/5/15.
 * 抽象主题角色， 即被观察者
 */
public abstract class Subject {

    private List<Observer> observerList = Lists.newArrayList();


    //注册观察者对象
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    //删除观察者对象
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    //通知所有注册的观察者对象
    public void notifyObservers(String newState) {
        for (Observer observer : observerList) {
            observer.update(newState);
        }
    }
}
