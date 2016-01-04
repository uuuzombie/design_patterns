package com.sky.demo.telescoping_constructor_pattern;

import com.google.common.base.Objects;

/**
 * Created by rg on 2014/5/8.
 */
//Telescoping constructor pattern重叠构造器模式
public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public NutritionFacts(int servingSize, int servings) {
        this(servingSize,servings,0);
    }

    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize,servings,calories,0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize,servings,calories,fat,0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize,servings,calories,fat,sodium,0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("servingSize", servingSize)
                .add("servings", servings)
                .add("calories", calories)
                .add("fat", fat)
                .add("sodium", sodium)
                .add("carbohydrate", carbohydrate)
                .toString();
    }
}
