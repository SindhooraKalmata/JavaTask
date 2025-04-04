package com.xworkz.main;

import com.xworkz.external.SoftDrink;
import com.xworkz.internal.Coffee;

public class SoftDrinkRunner {
    public static void main(String[] args) {
        SoftDrink softDrink=new SoftDrink();
        softDrink.drinkCost();
        softDrink.drinkName();
        softDrink.coffeeBrand();
        softDrink.hotOrCold();
        softDrink.quantity();

        SoftDrink softDrink1=new Coffee();
        softDrink1.quantity();
        softDrink1.drinkName();
        softDrink1.hotOrCold();
        softDrink1.coffeeBrand();
        softDrink1.drinkCost();

        SoftDrink softDrink2=new Coffee();
        softDrink2.quantity();
        softDrink2.drinkName();
        softDrink2.hotOrCold();
        softDrink2.coffeeBrand();
        softDrink2.drinkCost();

        SoftDrink softDrink3=new Coffee();
        softDrink3.quantity();
        softDrink3.drinkName();
        softDrink3.hotOrCold();
        softDrink3.coffeeBrand();
        softDrink3.drinkCost();
    }
}
