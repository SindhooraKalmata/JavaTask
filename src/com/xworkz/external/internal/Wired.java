package com.xworkz.external.internal;

import com.xworkz.external.Earphone;

public class Wired extends Earphone {
    public Wired(){
        System.out.println("No args const in Wired Earphone");
    }

    @Override
    public void connect() {
        System.out.println("Running from child");
    }

    @Override
    public void device() {
        System.out.println("Running from child");
    }

    @Override
    public void mobile() {
        System.out.println("Running from child");
    }

    @Override
    public void purchase() {
        System.out.println("Running from child");
    }

    @Override
    public void share() {
        System.out.println("Running from child");
    }
    public void disconnect(){
        System.out.println("Running from child");
    }
}
