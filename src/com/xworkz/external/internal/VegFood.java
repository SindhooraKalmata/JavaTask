package com.xworkz.external.internal;

import com.xworkz.external.Food;

public class VegFood extends Food {
    public VegFood(){
        super();
        System.out.println("No args const");
    }

    @Override
    public void eat() {
        System.out.println("Running from child");
    }

    @Override
    public void getIngredients() {
        System.out.println("Running from child");
    }

    @Override
    public void prepare() {
        System.out.println("Running from child");
    }

    @Override
    public void serve() {
        System.out.println("Running from child");
    }

    @Override
    public void store() {
        System.out.println("Running from child");
    }
    public void share(){
        System.out.println("Running from child");
    }
}
