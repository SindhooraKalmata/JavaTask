package com.xworkz.external.internal;

import com.xworkz.external.Bus;

public class SchoolBus extends Bus {
    public SchoolBus(){
        super();
        System.out.println("Bus is ready to gooooooooooooo.........");
    }

    @Override
    public void busType() {
        System.out.println("Running from child");
    }

    @Override
    public void eveningArrivalTime() {
        System.out.println("Running from child");
    }

    @Override
    public void morningArrivalTime() {
        System.out.println("Running from child");
    }

    @Override
    public void schoolName() {
        System.out.println("Running from child");
    }

    @Override
    public void wheels() {
        System.out.println("Running from child");
    }
    public void speed(){
        System.out.println("Running from child");
    }
}
