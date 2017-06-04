package com.sky.demo.observer_pattern.pattern;

/**
 * Created by user on 17/5/15.
 *
 * 具体观察者
 * 推模型 push
 */
public class ConcreteSubject extends Subject {

    private String state;

    public String getState() {
        return state;
    }


    public void change(String newState) {
        state = newState;
        System.out.println("subject change state to " + newState);

        //推模型
        //状态发生改变，通知各个观察者
        this.notifyObservers(newState);
    }
}
