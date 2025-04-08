package com.xworkz.external.internal;

import com.xworkz.external.Cream;

public class ChocolateCream extends Cream {
    public ChocolateCream() {
        super();
        System.out.println("ChocolateCream is a subclass");
    }

    @Override
    public void applyCream() {
        System.out.println("Running from child");
    }

    @Override
    public void packaging() {
        System.out.println("Running from child");
    }

    @Override
    public void provideMoisture() {
        System.out.println("Running from child");
    }

    @Override
    public void soothingEffect() {
        System.out.println("Running from child");
    }

    @Override
    public void scent() {
        System.out.println("Running from child");
    }
    public void spread(){
        System.out.println("Running from child");
    }
}
