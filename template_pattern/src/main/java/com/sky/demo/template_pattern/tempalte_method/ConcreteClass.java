package com.sky.demo.template_pattern.tempalte_method;

/**
 * Created by rg on 2014/8/1.
 */
public class ConcreteClass extends AbstractClass {

    @Override
    protected void doOperation1() {
        System.out.println("do operation1");
    }

    @Override
    protected void doOperation2() {
        System.out.println("do operation2");
    }
}
