package com.xworkz.external.internal;

import com.xworkz.external.PowerBank;

public class Anker extends PowerBank {
        public Anker(){
            super();
            System.out.println("No args const in Anker");
        }

    @Override
    public void charge() {
        System.out.println("Running from child");
    }

    @Override
    public void recharge() {
        System.out.println("Running from child");
    }

    @Override
    public void wire() {
        System.out.println("Running from child");
    }
    public void battery(){
            System.out.println("high battery life");
    }
}
