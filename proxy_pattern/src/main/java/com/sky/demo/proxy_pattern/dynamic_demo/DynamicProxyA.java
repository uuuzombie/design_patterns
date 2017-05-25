package com.sky.demo.proxy_pattern.dynamic_demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by user on 17/5/25.
 * 动态代理的优点
 * 1、类少了很多
 * 2、代理内容也就是InvocationHandler接口的实现类可以复用，可以给A接口用、也可以给B接口用，A接口用了InvocationHandler接口实现类A的代理，不想用了，可以方便地换成InvocationHandler接口实现B的代理
 * 3、最重要的，用了动态代理，就可以在不修改原来代码的基础上，就在原来代码的基础上做操作，这就是AOP即面向切面编程

 * 动态代理的缺点
 * 它只能针对接口生成代理，不能只针对某一个类生成代理
 *
 */
public class DynamicProxyA implements InvocationHandler {

    private Object target;

    public DynamicProxyA(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("dynamic proxy invoke begin");
        method.invoke(target, args);
        System.out.println("dynamic proxy invoke end");

        return null;
    }
}
