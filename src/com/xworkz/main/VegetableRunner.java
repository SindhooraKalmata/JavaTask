package com.xworkz.main;
import com.xworkz.external.Vegetable;
import com.xworkz.internal.LeafVeg;

public class VegetableRunner {
    public static void main(String[] args) {
        Vegetable vegetable = new Vegetable();
        vegetable.grow();
        vegetable.harvest();
        vegetable.nutrients();
        vegetable.pesticide();
        vegetable.water();

        Vegetable vegetable1 = new LeafVeg();
        vegetable1.grow();
        vegetable1.harvest();
        vegetable1.nutrients();
        vegetable1.pesticide();
        vegetable1.water();

        Vegetable vegetable2 = new LeafVeg();
        vegetable2.grow();
        vegetable2.harvest();
        vegetable2.nutrients();
        vegetable2.pesticide();
        vegetable2.water();

        Vegetable vegetable3 = new LeafVeg();
        vegetable3.grow();
        vegetable3.harvest();
        vegetable3.nutrients();
        vegetable3.pesticide();
        vegetable3.water();
    }
}
