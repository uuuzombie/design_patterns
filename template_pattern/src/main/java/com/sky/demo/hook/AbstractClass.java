package com.sky.demo.hook;

/**
 * Created by rg on 2014/8/1.
 */
public abstract class AbstractClass {

    //钩子方法
    public void hookMethod(){

    }

    //抽象方法
    public abstract void abstractMethod();

    //具体方法
    public void concreteMethod(){
        System.out.println("Concrete method");
    }
}
