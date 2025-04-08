package com.xworkz.external.internal;

import com.xworkz.external.Jam;

public class Kissan extends Jam {
    public Kissan(){
        super();
        System.out.println("Jam is Kissan");
    }

    @Override
    public void quantity() {
        System.out.println("Running from child");
    }

    @Override
    public void totalCost() {
        System.out.println("Running from child");
    }

    @Override
    public void jamColour() {
        System.out.println("Running from child");
    }

    @Override
    public void jamFlavour() {
        System.out.println("Running from child");
    }

    @Override
    public void jamName() {
        System.out.println("Running from child");
    }
    public void spread(){
        System.out.println("Running from child");
    }
}
