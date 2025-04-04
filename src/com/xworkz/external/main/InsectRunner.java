package com.xworkz.external.main;

import com.xworkz.external.Insect;
import com.xworkz.external.internal.ButterFly;

public class InsectRunner {
    public static void main(String[] args)
    {
        Insect insect=new Insect();
        insect.age();
        insect.legs();
        insect.eyeColor();
        insect.wings();
        insect.name();

        Insect insect1=new ButterFly();
        insect1.name();
        insect1.wings();
        insect1.legs();
        insect1.age();
        insect1.eyeColor();

        Insect insect2=new ButterFly();
        insect2.name();
        insect2.wings();
        insect2.legs();
        insect2.age();
        insect2.eyeColor();

        Insect insect3=new ButterFly();
        insect3.name();
        insect3.wings();
        insect3.legs();
        insect3.age();
        insect3.eyeColor();
    }
}
