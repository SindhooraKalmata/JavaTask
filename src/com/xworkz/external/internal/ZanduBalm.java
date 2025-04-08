package com.xworkz.external.internal;

import com.xworkz.external.Balm;

public class ZanduBalm extends Balm {
    public ZanduBalm(){
        super();
        System.out.println("It's a pain relief balm");
    }

    @Override
    public void balmColour() {
        System.out.println("Running for child");
    }

    @Override
    public void balmType() {
        System.out.println("Running for child");
    }
    public void relief(){
        System.out.println("Balm Reliefs");
    }
}
