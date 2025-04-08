package com.xworkz.external.internal;

import com.xworkz.external.Bag;

public class SchoolBag extends Bag {
    public SchoolBag() {
        super();
        System.out.println("SchoolBag is a subclass");
    }

    @Override
    public void storeItems() {
        System.out.println("Running from child");
    }

    @Override
    public void carryBag() {
        System.out.println("Running from child");
    }

    @Override
    public void checkCapacity() {
        System.out.println("Running from child");
    }

    @Override
    public void openBag() {
        System.out.println("Running from child");
    }

    @Override
    public void zipBag() {
        System.out.println("Running from child");
    }
    public void buy(){
        System.out.println("Running from child");
    }
}
