package com.xworkz.external.internal;

import com.xworkz.external.Seminar;

public class Techy extends Seminar {
    public Techy() {
        super();
        System.out.println("no args const of Techy");
    }

    @Override
    public void date() {
        System.out.println("Running from child");
    }

    @Override
    public void schedule() {
        System.out.println("Running from child");
    }

    @Override
    public void student() {
        System.out.println("Running from child");
    }

    @Override
    public void time() {
        System.out.println("Running from child");
    }

    @Override
    public void topic() {
        System.out.println("Running from child");
    }
    public void prepare(){
        System.out.println("Running from child");
    }
}
