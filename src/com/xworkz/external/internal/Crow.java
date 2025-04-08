package com.xworkz.external.internal;

import com.xworkz.external.Bird;

public class Crow extends Bird {
    public Crow() {
        super();
        System.out.println("no args const of Crow");
    }

    @Override
    public void age() {
        System.out.println("Running from child");
    }

    @Override
    public void colour() {
        System.out.println("Running from child");
    }

    @Override
    public void height() {
        System.out.println("Running from child");
    }

    @Override
    public void gender() {
        System.out.println("Running from child");
    }

    @Override
    public void weight() {
        System.out.println("Running from child");
    }
    public void layEgg(){
        System.out.println("Running from child");
    }
}