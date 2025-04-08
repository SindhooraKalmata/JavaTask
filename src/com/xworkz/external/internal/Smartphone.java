package com.xworkz.external.internal;

import com.xworkz.external.ElectronicDevice;

public class Smartphone extends ElectronicDevice {
    public Smartphone(){
        super();
        System.out.println("No agr const");
    }

    @Override
    public void color() {
        System.out.println("Running from child");
    }

    @Override
    public void brand() {
        System.out.println("Running from child");
    }

    @Override
    public void cost() {
        System.out.println("Running from child");
    }

    @Override
    public void camera() {
        System.out.println("Running from child");
    }

    @Override
    public void storage() {
        System.out.println("Running from child");
    }
    public void switchOff(){
        System.out.println("Running from child");
    }
}

