package com.xworkz.external.internal;

import com.xworkz.external.Village;

public class ModernVillage extends Village {
    public ModernVillage() {
        super();
        System.out.println("ModernVillage is a subclass");
    }

    @Override
    public void hostFestivals() {
        System.out.println("Running from child");
    }

    @Override
    public void maintainRoads() {
        System.out.println("Running from child");
    }

    @Override
    public void offerCommunitySupport() {
        System.out.println("Running from child");
    }

    @Override
    public void offerFarming() {
        System.out.println("Running from child");
    }

    @Override
    public void provideWater() {
        System.out.println("Running from child");
    }
    public void fair(){
        System.out.println("Running from child");
    }
}
