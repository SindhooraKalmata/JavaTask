package com.xworkz.external.internal;

import com.xworkz.external.Mammal;

public class Cow extends Mammal {
    public Cow(){
        super();
        System.out.println("Cow give birth to young ones");
    }

    @Override
    public void name() {
        System.out.println("Running from child");
    }

    @Override
    public void cost() {
        System.out.println("Running from child");
    }

    @Override
    public void age() {
        System.out.println("Running from child");
    }

    @Override
    public void breed() {
        System.out.println("Running from child");
    }

    @Override
    public void health() {
        System.out.println("Running from child");
    }
    public void sounds(){
        System.out.println("Running from child");
    }
}
