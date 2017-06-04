package com.sky.demo.proxy_pattern.static_demo;

/**
 * Created by user on 17/5/25.
 */
public class StaticUserServiceImpl implements StaticUserService {

    @Override
    public void print() {
        System.out.println("user service impl");
    }
}
