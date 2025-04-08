package com.xworkz.external.internal;

import com.xworkz.external.Fish;

public class Shark extends Fish {
    public Shark()
    {
        super();
        System.out.println("no arg constructor of shark");
    }

    @Override
    public void age() {
        System.out.println("Running from child");
    }

    @Override
    public void height() {
        System.out.println("Running from child");
    }

    @Override
    public void colour() {
        System.out.println("Running from child");
    }

    @Override
    public void weight() {
        System.out.println("Running from child");
    }

    @Override
    public void gender() {
        System.out.println("Running from child");
    }
    public void swims(){
        System.out.println("Running from child");
    }
}
