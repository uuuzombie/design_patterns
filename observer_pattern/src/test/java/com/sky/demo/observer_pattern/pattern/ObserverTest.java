package com.sky.demo.observer_pattern.pattern;

import org.junit.Test;

/**
 * Created by user on 17/5/15.
 */
public class ObserverTest {


    @Test
    public void test_observer() {

        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();

        subject.attach(observer1);
        subject.attach(observer2);

        subject.change("state1");  //all observer will receive notification

    }
}
