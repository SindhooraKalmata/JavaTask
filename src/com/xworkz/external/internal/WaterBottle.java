package com.xworkz.external.internal;

import com.xworkz.external.Bottle;

public class WaterBottle extends Bottle {
    public WaterBottle() {
        super();
        System.out.println("WaterBottle is a subclass");
    }

    @Override
    public void carry() {
        System.out.println("Running from child");
    }

    @Override
    public void clean() {
        System.out.println("Running from child");
    }

    @Override
    public void close() {
        System.out.println("Running from child");
    }

    @Override
    public void drink() {
        System.out.println("Running from child");
    }

    @Override
    public void fill() {
        System.out.println("Running from child");
    }
    public void pour(){
        System.out.println("Running from child");
    }
}
