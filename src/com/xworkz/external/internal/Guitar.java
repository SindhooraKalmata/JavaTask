package com.xworkz.external.internal;

import com.xworkz.external.Instrument;

public class Guitar extends Instrument {
    public Guitar(){
        super();
        System.out.println("No args const");
    }

    @Override
    public void cords() {
        System.out.println("Running from child");
    }

    @Override
    public void keys() {
        System.out.println("Running from child");
    }

    @Override
    public void play() {
        System.out.println("Running from child");
    }

    @Override
    public void strings() {
        System.out.println("Running from child");
    }
    public void plays(){
        System.out.println("Running from child");
    }
}
