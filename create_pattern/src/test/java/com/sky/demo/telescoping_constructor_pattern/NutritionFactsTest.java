package com.sky.demo.telescoping_constructor_pattern;

import org.junit.Test;

/**
 * Created by rg on 2014/5/8.
 */
public class NutritionFactsTest {

    //private NutritionFacts nutritionFacts;

    @Test
    public void test_constructor(){

        NutritionFacts cocaCola = new NutritionFacts(240,80,100,0,35,28);
        System.out.println(cocaCola);

        NutritionFacts pepsi = new NutritionFacts(200,100);
        System.out.println(pepsi);

    }

}
