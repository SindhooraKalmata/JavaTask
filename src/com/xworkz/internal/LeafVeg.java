package com.xworkz.internal;

import com.xworkz.external.Vegetable;

public class LeafVeg extends Vegetable {
    public LeafVeg(){
        System.out.println("no-arg const is running");
    }

    public void growAboveGround(){
        System.out.println("Running growAboveGround in Leafveg");
    }
}
