package com.xworkz.external.internal;

import com.xworkz.external.Appliance;

public class Television extends Appliance {
    public Television(){
        super();
        System.out.println("no arg const");
    }
    public void displays(){
        System.out.println("Television displays the shows");
    }

    @Override
    public void height() {
        System.out.println("Running form child");
    }

    @Override
    public void pieces() {
        System.out.println("Running form child");
    }

    @Override
    public void width() {
        System.out.println("Running form child");
    }
}
