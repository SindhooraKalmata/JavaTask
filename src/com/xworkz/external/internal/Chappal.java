package com.xworkz.external.internal;

import com.xworkz.external.FootWear;

public class Chappal extends FootWear {
    public Chappal(){
        super();
        System.out.println("Footwear is Chappal");
    }

    @Override
    public void cost() {
        System.out.println("Running from child");
    }

    @Override
    public void brand() {
        System.out.println("Running from child");
    }

    @Override
    public void footwearColour() {
        System.out.println("Running from child");
    }

    @Override
    public void footwearType() {
        System.out.println("Running from child");
    }

    @Override
    public void material() {
        System.out.println("Running from child");
    }
    public void wear(){
        System.out.println("Running from child");
    }
}
