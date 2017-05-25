package com.sky.demo.proxy_pattern.dynamic_demo;

/**
 * Created by user on 17/5/25.
 */
public class DynamicSchoolServiceImpl implements DynamicSchoolService {


    @Override
    public void getSchool() {
        System.out.println("NewYork School");
    }
}
