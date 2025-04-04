package com.xworkz.external.main;

import com.xworkz.external.FootWear;
import com.xworkz.external.internal.Chappal;

public class FootwearRunner {
    public static void main(String[] args) {
        FootWear footWear=new FootWear();
        footWear.footwearType();
        footWear.brand();
        footWear.cost();
        footWear.footwearColour();
        footWear.material();

        FootWear footWear1=new Chappal();
        footWear1.material();
        footWear1.cost();
        footWear1.footwearColour();
        footWear1.footwearType();
        footWear1.brand();

        FootWear footWear2=new Chappal();
        footWear2.material();
        footWear2.cost();
        footWear2.footwearColour();
        footWear2.footwearType();
        footWear2.brand();

        FootWear footWear3=new Chappal();
        footWear3.material();
        footWear3.cost();
        footWear3.footwearColour();
        footWear3.footwearType();
        footWear3.brand();
    }
}
