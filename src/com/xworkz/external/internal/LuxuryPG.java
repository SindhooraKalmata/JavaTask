package com.xworkz.external.internal;

import com.xworkz.external.PG;

public class LuxuryPG extends PG {
    public LuxuryPG() {
        super();
        System.out.println("LuxuryPG is a subclass");
    }

    @Override
    public void ensureSecurity() {
        System.out.println("Running from child");
    }

    @Override
    public void manageRent() {
        System.out.println("Running from child");
    }

    @Override
    public void offerFood() {
        System.out.println("Running from child");
    }

    @Override
    public void provideRoom() {
        System.out.println("Running from child");
    }

    @Override
    public void provideWiFi() {
        System.out.println("Running from child");
    }
    public void booking(){
        System.out.println("Running from child");
    }
}
