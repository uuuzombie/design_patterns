package com.sky.demo.proxy_pattern.dynamic_demo;

/**
 * Created by user on 17/5/25.
 */
public class DynamicUserServiceImpl implements DynamicUserService {


    @Override
    public String print() {
        System.out.println("dynamic user service impl");
        return "dynamic user service impl";
    }
}
