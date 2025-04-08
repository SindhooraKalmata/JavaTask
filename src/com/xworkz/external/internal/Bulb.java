package com.xworkz.external.internal;

import com.xworkz.external.Light;

public class Bulb extends Light {
    public Bulb() {
        super();
        System.out.println("no args const of Crow");
    }

    @Override
    public void cost() {
        System.out.println("Running from child");
    }

    @Override
    public void pieces() {
        System.out.println("Running from child");
    }

    @Override
    public void size() {
        System.out.println("Running from child");
    }

    @Override
    public void colour() {
        System.out.println("Running from child");
    }

    @Override
    public void totalCost() {
        System.out.println("Running from child");
    }
    public void breaks(){
        System.out.println("Running from child");
    }
}
