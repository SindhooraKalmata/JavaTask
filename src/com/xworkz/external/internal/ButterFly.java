package com.xworkz.external.internal;

import com.xworkz.external.Insect;

import java.security.PublicKey;
import java.util.Optional;

public class ButterFly extends Insect {
    public ButterFly()
    {
    super();
        System.out.println("No arg const of Butterfly");
    }

    @Override
    public void age() {
        System.out.println("Running from child");
    }

    @Override
    public void eyeColor() {
        System.out.println("Running from child");
    }

    @Override
    public void legs() {
        System.out.println("Running from child");
    }

    @Override
    public void name() {
        System.out.println("Running from child");
    }

    @Override
    public void wings() {
        System.out.println("Running from child");
    }
    public void flies(){
        System.out.println("Running from child");
    }
}
