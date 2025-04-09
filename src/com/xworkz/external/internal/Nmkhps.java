package com.xworkz.external.internal;

import com.xworkz.external.School;

public class Nmkhps  extends School {
    public Nmkhps() {
        super();
        System.out.println("no args const of NMKHPS");
    }

    @Override
    public void name() {
        System.out.println("Running from child");
    }

    @Override
    public void color() {
        System.out.println("Running from child");
    }

    @Override
    public void District() {
        System.out.println("Running from child");
    }

    @Override
    public void fees() {
        System.out.println("Running from child");
    }

    @Override
    public void place() {
        System.out.println("Running from child");
    }
    
    public void opens(){
        System.out.println("Running from child");
    }
}
