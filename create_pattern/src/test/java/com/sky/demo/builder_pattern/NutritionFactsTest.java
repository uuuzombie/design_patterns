package com.sky.demo.builder_pattern;

import org.junit.Test;

/**
 * Created by rg on 2014/5/8.
 */
public class NutritionFactsTest {

    //private NutritionFacts nutritionFacts;

    @Test
    public void test_constructor(){
        NutritionFacts cocaCola = new NutritionFacts.Builder(240,40).calories(100).fat(200).sodium(30).carbohydrate(100).build();
        System.out.println(cocaCola);

        NutritionFacts pepsi = new NutritionFacts.Builder(200,100).build();
        System.out.println(pepsi);
    }

}
