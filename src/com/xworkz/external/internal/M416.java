package com.xworkz.external.internal;

import com.xworkz.external.Weapon;

public class M416 extends Weapon {
    public M416(){
        super();
        System.out.println("no arg const");
    }

    @Override
    public void pieces() {
        System.out.println("Running from child");
    }

    @Override
    public void colour() {
        System.out.println("Running from child");
    }

    @Override
    public void Brand() {
        System.out.println("Running from child");
    }

    @Override
    public void price() {
        System.out.println("Running from child");
    }

    @Override
    public void weaponName() {
        System.out.println("Running from child");
    }
    public void shoot(){
        System.out.println("Running from child");
    }
}
