package com.xworkz.external.internal;

import com.xworkz.external.Box;

public class CardboardBox extends Box {
    public CardboardBox() {
        super();
        System.out.println("CardboardBox is a subclass");
    }

    @Override
    public void checkSize() {
        System.out.println("Running from child");
    }

    @Override
    public void closeBox() {
        System.out.println("Running from child");
    }

    @Override
    public void moveBox() {
        System.out.println("Running from child");
    }

    @Override
    public void openBox() {
        System.out.println("Running from child");
    }

    @Override
    public void storeItems() {
        System.out.println("Running from child");
    }
    public void breaks(){
        System.out.println("Running from child");
    }
}

