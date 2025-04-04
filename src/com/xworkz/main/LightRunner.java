package com.xworkz.main;

import com.xworkz.external.Light;
import com.xworkz.internal.Bulb;

public class LightRunner {
    public static void main(String[] args) {
        Light light=new Light();
        light.cost();
        light.colour();
        light.size();
        light.totalCost();
        light.pieces();

        Light light1=new Bulb();
        light1.pieces();
        light1.size();
        light1.colour();
        light1.cost();
        light1.totalCost();

        Light light2=new Bulb();
        light2.pieces();
        light2.size();
        light2.colour();
        light2.cost();
        light2.totalCost();

        Light light3=new Bulb();
        light3.pieces();
        light3.size();
        light3.colour();
        light3.cost();
        light3.totalCost();
    }
}
