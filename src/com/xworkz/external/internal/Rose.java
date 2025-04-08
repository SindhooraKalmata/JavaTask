package com.xworkz.external.internal;

import com.xworkz.external.Plant;

public class Rose extends Plant {
    public Rose(){
        super();
        System.out.println("no arg const");
    }

    @Override
    public void name() {
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
    public void age() {
        System.out.println("Running from child");
    }

    @Override
    public void noOfRoses() {
        System.out.println("Running from child");
    }
public void grows(){
    System.out.println("Running from child");
}

}
