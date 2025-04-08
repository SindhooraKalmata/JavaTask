package com.xworkz.external.internal;

import com.xworkz.external.Tool;

public class Hammer extends Tool {
    public Hammer(){
        super();
        System.out.println("no arg const");
    }

    @Override
    public void cost() {
        System.out.println("Running from child");
    }

    @Override
    public void size() {
        System.out.println("Running from child");
    }

    @Override
    public void pieces() {
        System.out.println("Running from child");
    }

    @Override
    public void toolName() {
        System.out.println("Running from child");
    }

    @Override
    public void toolType() {
        System.out.println("Running from child");
    }
    public void beats(){
        System.out.println("Running from child");
    }
}
