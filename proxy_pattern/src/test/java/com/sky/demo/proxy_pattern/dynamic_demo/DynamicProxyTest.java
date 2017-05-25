package com.sky.demo.proxy_pattern.dynamic_demo;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by user on 17/5/25.
 */
public class DynamicProxyTest {


    @Test
    public void test_dynamic_proxy_A_user_service() {
        DynamicUserService userService = new DynamicUserServiceImpl();
        InvocationHandler invocationHandler = new DynamicProxyA(userService);

        DynamicUserService service = (DynamicUserService) Proxy.newProxyInstance(DynamicUserService.class.getClassLoader(),
                new Class<?>[]{DynamicUserService.class}, invocationHandler);

        service.print();

    }

    @Test
    public void test_dynamic_proxy_A_school_service() {
        DynamicSchoolService schoolService = new DynamicSchoolServiceImpl();
        InvocationHandler invocationHandler = new DynamicProxyA(schoolService);

        DynamicSchoolService service = (DynamicSchoolService) Proxy.newProxyInstance(DynamicSchoolService.class.getClassLoader(),
                new Class<?>[]{DynamicSchoolService.class}, invocationHandler);

        service.getSchool();

    }

}
