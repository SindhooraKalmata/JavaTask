package com.xworkz.external.internal;

import com.xworkz.external.Vegetable;

public class LeafVeg extends Vegetable {
    public LeafVeg(){
        System.out.println("no-arg const is running");
    }

    public void growAboveGround(){
        System.out.println("Running growAboveGround in Leafveg");
    }

    @Override
    public void grow() {
        System.out.println("Running from child");
    }

    @Override
    public void harvest() {
        System.out.println("Running from child");
    }

    @Override
    public void nutrients() {
        System.out.println("Running from child");
    }

    @Override
    public void pesticide() {
        System.out.println("Running from child");
    }

    @Override
    public void water() {
        System.out.println("Running from child");
    }
    public void cultivate(){
        System.out.println("Running from child");
    }
}
