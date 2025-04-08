package com.xworkz.external.internal;

import com.xworkz.external.Hostel;

public class Vcvr extends Hostel{
    public Vcvr() {
        super();
        System.out.println("no args const of VCVR");
    }

    @Override
    public void place() {
        System.out.println("Running from child");
    }

    @Override
    public void fees() {
        System.out.println("Running from child");
    }

    @Override
    public void floors() {
        System.out.println("Running from child");
    }

    @Override
    public void Name() {
        System.out.println("Running from child");
    }

    @Override
    public void noOfRooms() {
        System.out.println("Running from child");
    }
    public void opens(){
        System.out.println("Running from child");
    }
}
