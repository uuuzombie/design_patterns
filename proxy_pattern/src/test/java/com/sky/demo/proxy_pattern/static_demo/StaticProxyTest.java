package com.sky.demo.proxy_pattern.static_demo;

import org.junit.Test;

/**
 * Created by user on 17/5/25.
 */
public class StaticProxyTest {

    @Test
    public void test_proxy() {
        StaticUserService userService = new StaticUserServiceImpl();

        StaticUserServiceProxy proxy = new StaticUserServiceProxy(userService);

        proxy.print();

    }
}
