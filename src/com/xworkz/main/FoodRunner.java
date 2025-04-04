package com.xworkz.main;
import com.xworkz.internal.VegFood;
import com.xworkz.external.Food;

public class FoodRunner {
    public static void main(String[] args) {
        Food food= new Food();
        food.prepare();
        food.serve();
        food.eat();
        food.getIngredients();
        food.store();

        Food food1= new VegFood();
        food1.prepare();
        food1.serve();
        food1.eat();
        food1.getIngredients();
        food1.store();

        Food food2= new VegFood();
        food2.prepare();
        food2.serve();
        food2.eat();
        food2.getIngredients();
        food2.store();

        Food food3= new VegFood();
        food3.prepare();
        food3.serve();
        food3.eat();
        food3.getIngredients();
        food3.store();

    }
}
