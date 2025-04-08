package com.xworkz.external.internal;

import com.xworkz.external.Device;

public class Phone extends Device {
    public Phone(){
        super();
        System.out.println("no-argu const is running on Phone");
    }

    @Override
    public void call() {
        System.out.println("Running from child");
    }

    @Override
    public void message() {
        System.out.println("Running from child");
    }

    @Override
    public void playGames() {
        System.out.println("Running from child");
    }

    @Override
    public void track() {
        System.out.println("Running from child");
    }

    @Override
    public void videoCall() {
        System.out.println("Running from child");
    }
    public void switchOff(){
        System.out.println("Running from child");
    }
}
