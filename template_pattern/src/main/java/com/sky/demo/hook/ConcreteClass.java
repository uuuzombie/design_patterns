package com.sky.demo.hook;

/**
 * Created by rg on 2014/8/1.
 */
public class ConcreteClass extends AbstractClass {

    //父类钩子方法被重写
    @Override
    public void hookMethod() {
        System.out.println("re-implement of hook method");
    }

    @Override
    public void abstractMethod() {
        System.out.println("implement of abstract method");
    }
}
