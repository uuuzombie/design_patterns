package com.sky.demo.template_pattern.tempalte_method;

/**
 * Created by rg on 2014/8/1.
 */
public abstract class AbstractClass {

    protected abstract void doOperation1();

    protected abstract void doOperation2();

    private final void doOperation3(){
        //do something
    }

    //模板方法
    public void templateMethod(){

        doOperation1();

        doOperation2();

        doOperation3();
    }
}
