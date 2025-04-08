package com.xworkz.external.internal;

import com.xworkz.external.Juice;

public class AppleJuice extends Juice {
    public AppleJuice() {
        super();
        System.out.println("no args const of Apple juice");
    }

    @Override
    public void cost() {
        System.out.println("Running from child");
    }

    @Override
    public void color() {
        System.out.println("Running from child");
    }

    @Override
    public void noOfBottle() {
        System.out.println("Running from child");
    }

    @Override
    public void quantity() {
        System.out.println("Running from child");
    }
    public void drink(){
        System.out.println("Running drink from child");
    }
}
