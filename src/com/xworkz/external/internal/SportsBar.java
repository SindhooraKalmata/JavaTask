package com.xworkz.external.internal;

import com.xworkz.external.Bar;

public class SportsBar extends Bar {
    public SportsBar() {
        super();
        System.out.println("SportsBar is a subclass");
    }

    @Override
    public void maintainHygiene() {
        System.out.println("Running from child");
    }

    @Override
    public void offerSeating() {
        System.out.println("Running from child");
    }

    @Override
    public void playMusic() {
        System.out.println("Running from child");
    }

    @Override
    public void operateLateNight() {
        System.out.println("Running from child");
    }

    @Override
    public void serveDrinks() {
        System.out.println("Running from child");
    }
    public void closed(){
        System.out.println("Bar is closed");
    }
}
