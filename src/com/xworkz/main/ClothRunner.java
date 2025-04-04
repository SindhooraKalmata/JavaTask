package com.xworkz.main;

import com.xworkz.external.Cloth;
import com.xworkz.internal.CottonCloth;

public class ClothRunner {
    public static void main(String[] args) {
        Cloth cloth=new Cloth();
        cloth.clothType();
        cloth.colourOfCloth();
        cloth.costPerMeter();
        cloth.measurement();
        cloth.totalCost();

        Cloth cloth1=new CottonCloth();
        cloth1.totalCost();
        cloth1.clothType();
        cloth1.colourOfCloth();
        cloth1.measurement();
        cloth1.totalCost();

        Cloth cloth2=new CottonCloth();
        cloth2.totalCost();
        cloth2.clothType();
        cloth2.colourOfCloth();
        cloth2.measurement();
        cloth2.totalCost();

        Cloth cloth3=new CottonCloth();
        cloth3.totalCost();
        cloth3.clothType();
        cloth3.colourOfCloth();
        cloth3.measurement();
        cloth3.totalCost();
    }
}
