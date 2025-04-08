package com.xworkz.external.internal;

import com.xworkz.external.Cloth;

public class CottonCloth extends Cloth {
    public CottonCloth(){
        super();
        System.out.println("Cloth is Cotton.");
    }

    @Override
    public void totalCost() {
        System.out.println("Running from child");
    }

    @Override
    public void clothType() {
        System.out.println("Running from child");
    }

    @Override
    public void colourOfCloth() {
        System.out.println("Running from child");
    }

    @Override
    public void costPerMeter() {
        System.out.println("Running from child");
    }

    @Override
    public void measurement() {
        System.out.println("Running from child");
    }
    public void wear(){
        System.out.println("Running from child");
    }
}
