package com.sky.demo.java_bean_pattern;

import org.junit.Test;

/**
 * Created by rg on 2014/5/9.
 */
public class NutritionFactsTest {

    @Test
    public void test_constructor(){

        NutritionFacts cocaCola = new NutritionFacts();
        System.out.println(cocaCola);

        NutritionFacts pepsi = new NutritionFacts();
        pepsi.setServings(200);
        pepsi.setServingSize(100);
        System.out.println(pepsi);
    }
}
