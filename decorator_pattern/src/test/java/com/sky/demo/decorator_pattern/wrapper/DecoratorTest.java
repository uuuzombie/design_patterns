package com.sky.demo.decorator_pattern.wrapper;

import org.junit.Test;

/**
 * Created by user on 17/5/17.
 */
public class DecoratorTest {


    @Test
    public void test_wrapper() {

        Sage monkey = new Monkey();

        //第一种写法
        Sage bird = new Bird(monkey);
        Sage fish = new Fish(bird);

        //第二种写法
//        Sage fish = new Fish(new Bird(Mokey));

        fish.move();

    }

}
