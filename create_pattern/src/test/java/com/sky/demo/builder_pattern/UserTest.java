package com.sky.demo.builder_pattern;

import org.junit.Test;

/**
 * Created by rg on 2014/5/10.
 */
public class UserTest {

    @Test
    public void test_constructor(){

        User user = new User.Builder(1,"wang","234").builder();
        System.out.println(user);

        User user2 = new User.Builder(2,"zhang","22").age(10).address("changchun").builder();
        System.out.println(user2);
    }
}
