package com.xworkz.external.internal;

import com.xworkz.external.Home;

public class Apartment extends Home {
    public Apartment() {
        super();
        System.out.println("Apartment is a subclass");
    }

    @Override
    public void hasGarden() {
        System.out.println("Running from child");
    }

    @Override
    public void hasKitchen() {
        System.out.println("Running from child");
    }

    @Override
    public void secureDoors() {
        System.out.println("Running from child");
    }

    @Override
    public void provideShelter() {
        System.out.println("Running from child");
    }

    @Override
    public void hasRooms() {
        System.out.println("Running from child");
    }
    public void payRent(){
        System.out.println("Running from child");
    }
}
