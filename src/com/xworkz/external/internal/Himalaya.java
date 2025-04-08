package com.xworkz.external.internal;

import com.xworkz.external.Moisturiser;

public class Himalaya extends Moisturiser {
    public Himalaya(){
        super();
        System.out.println("Moisturiser nourishes the skin");
    }

    @Override
    public void cost() {
        System.out.println("Running from child");
    }

    @Override
    public void name() {
        System.out.println("Running from child");
    }

    @Override
    public void quantity() {
        System.out.println("Running from child");
    }

    @Override
    public void nourish() {
        System.out.println("Running from child");
    }

    @Override
    public void piece() {
        System.out.println("Running from child");
    }
    public void apply(){
        System.out.println("Running from child");
    }
}
