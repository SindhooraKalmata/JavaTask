package com.xworkz.external.internal;

import com.xworkz.external.Vehicle;

public class Truck extends Vehicle {
    public Truck(){
        super();;
        System.out.println("no-argu constructor of Truck");
    }

    @Override
    public void accelerate() {
        System.out.println("Running from child");
    }

    @Override
    public void brake() {
        System.out.println("Running from child");
    }

    @Override
    public void speed() {
        System.out.println("Running from child");
    }

    @Override
    public void start() {
        System.out.println("Running from child");
    }

    @Override
    public void stop() {
        System.out.println("Running from child");
    }
    public void moves(){
        System.out.println("Running from child");
    }
}
