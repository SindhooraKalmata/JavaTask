package com.xworkz.external.internal;

import com.xworkz.external.Wire;

public class ElectricWire extends Wire {
    public ElectricWire() {
        super();
        System.out.println("ElectricWire is a subclass");
    }

    @Override
    public void conductElectricity() {
        System.out.println("Running from child");
    }

    @Override
    public void checkInsulation() {
        System.out.println("Running from child");
    }

    @Override
    public void connectDevices() {
        System.out.println("Running from child");
    }

    @Override
    public void measureLength() {
        System.out.println("Running from child");
    }

    @Override
    public void rollWire() {
        System.out.println("Running from child");
    }
    public void connect(){
        System.out.println("Running from child");
    }
}
