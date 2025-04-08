package com.xworkz.external.internal;

import com.xworkz.external.Government;

public class Democracy extends Government {
    public Democracy() {
        super();
        System.out.println("no-argu const running in democracy");
    }

    @Override
    public void collectTaxes() {
        System.out.println("Running from child");
    }

    @Override
    public void conductElections() {
        System.out.println("Running from child");
    }

    @Override
    public void enforceLaws() {
        System.out.println("Running from child");
    }

    @Override
    public void makeLaws() {
        System.out.println("Running from child");
    }

    @Override
    public void provideService() {
        System.out.println("Running from child");
    }
    public void announce(){
        System.out.println("Running from child");
    }
}
