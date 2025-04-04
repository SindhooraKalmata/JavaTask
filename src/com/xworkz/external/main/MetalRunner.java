package com.xworkz.external.main;

import com.xworkz.external.Metal;
import com.xworkz.external.internal.Iron;

public class MetalRunner {
    public static void main(String[] args) {
        Metal metal=new Metal();
        metal.metalType();
        metal.cost();
        metal.colour();
        metal.quality();
        metal.weight();

        Metal metal1=new Iron();
        metal1.weight();
        metal1.quality();
        metal1.metalType();
        metal1.cost();
        metal1.colour();

        Metal metal2=new Iron();
        metal2.weight();
        metal2.quality();
        metal2.metalType();
        metal2.cost();
        metal2.colour();

        Metal metal3=new Iron();
        metal3.weight();
        metal3.quality();
        metal3.metalType();
        metal3.cost();
        metal3.colour();
    }
}
