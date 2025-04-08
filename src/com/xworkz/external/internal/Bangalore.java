package com.xworkz.external.internal;

import com.xworkz.external.City;

public class Bangalore extends City {
    public Bangalore(){
        System.out.println("No args const in bangalore");
    }

    @Override
    public void population() {
        System.out.println("Running from child");
    }

    @Override
    public void shop() {
        System.out.println("Running from child");
    }

    @Override
    public void travel() {
        System.out.println("Running from child");
    }

    @Override
    public void type() {
        System.out.println("Running from child");
    }

    @Override
    public void trees() {
        System.out.println("Running from child");
    }
    public void raining(){
        System.out.println("Running Bangalore from child");
    }
}
