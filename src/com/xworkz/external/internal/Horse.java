package com.xworkz.external.internal;

import com.xworkz.external.Animal;

public class Horse extends Animal {
    public Horse() {
        super();
        System.out.println("no args const of horse");
    }

    @Override
    public void age() {
        System.out.println("Running from Child");
    }

    @Override
    public void colour() {
        System.out.println("Running from Child");
    }

    @Override
    public void gender() {
        System.out.println("Running from Child");
    }

    @Override
    public void height() {
        System.out.println("Running from Child");
    }
    public void runs(){
        System.out.println("Horse Runs");
    }
}
