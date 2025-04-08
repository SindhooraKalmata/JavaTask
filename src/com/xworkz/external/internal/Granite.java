package com.xworkz.external.internal;

import com.xworkz.external.Floor;

public class Granite extends Floor {
    public Granite(){
        super();
        System.out.println("Floor is Granite");
    }

    @Override
    public void floorColour() {
        System.out.println("Running from child");
    }

    @Override
    public void noOfGranite() {
        System.out.println("Running from child");
    }

    @Override
    public void flooringShop() {
        System.out.println("Running from child");
    }

    @Override
    public void floorType() {
        System.out.println("Running from child");
    }

    @Override
    public void pricePerFeet() {
        System.out.println("Running from child");
    }
    public void breaks(){
        System.out.println("Running from child");
    }
}
