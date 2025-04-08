package com.xworkz.external.internal;

import com.xworkz.external.Furniture;

public class Table extends Furniture {
    public Table(){
        super();
        System.out.println("no arg const");
    }

    @Override
    public void cost() {
        System.out.println("Running from child");
    }

    @Override
    public void pieces() {
        System.out.println("Running from child");
    }

    @Override
    public void furnitureName() {
        System.out.println("Running from child");
    }

    @Override
    public void shape() {
        System.out.println("Running from child");
    }

    @Override
    public void wood() {
        System.out.println("Running from child");
    }
    public void breaks(){
        System.out.println("Running from child");
    }

}
