package com.xworkz.external.internal;

import com.xworkz.external.Park;

public class ChildrenPark extends Park {
    public ChildrenPark() {
        super();
        System.out.println("ChildrenPark is a subclass");
    }

    @Override
    public void closePark() {
        System.out.println("Running from child");
    }

    @Override
    public void openPark() {
        System.out.println("Running from child");
    }

    @Override
    public void maintainGreenery() {
        System.out.println("Running from child");
    }

    @Override
    public void provideSeatingArea() {
        System.out.println("Running from child");
    }

    @Override
    public void provideWalkingTrack() {
        System.out.println("Running from child");
    }
    public void watering(){
        System.out.println("Running from child");
    }
}
