package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Food;
import com.xworkz.external.internal.VegFood;
import com.xworkz.external.internal.ZanduBalm;

public class FoodCast {
    public void apply(Food food){
        food.eat();
        food.getIngredients();
        food.prepare();
        food.serve();
        food.store();

        if(food instanceof VegFood){
            VegFood vegFood=new VegFood();
            vegFood.share();
        }
    }
}
