package com.xworkz.external.internal;

import com.xworkz.external.Pant;

public class JeansPant extends Pant {
    public JeansPant(){
        super();
        System.out.println("Pant is Jeans");
    }
    @Override
    public void size() {
        System.out.println("Running from child");
    }

    @Override
    public void brand() {
        System.out.println("Running from child");
    }

    @Override
    public void clothType() {
        System.out.println("Running from child");
    }

    @Override
    public void pantColour() {
        System.out.println("Running from child");
    }

    @Override
    public void pantCost() {
        System.out.println("Running from child");
    }
    public void wear(){
        System.out.println("Running from child");
    }
}
