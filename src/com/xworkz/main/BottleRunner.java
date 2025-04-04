package com.xworkz.main;

import com.xworkz.external.Bottle;
import com.xworkz.internal.WaterBottle;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle();
        bottle1.fill();
        bottle1.drink();
        bottle1.clean();
        bottle1.close();
        bottle1.carry();

        Bottle bottle2 = new WaterBottle();
        bottle2.fill();
        bottle2.drink();
        bottle2.clean();
        bottle2.close();
        bottle2.carry();

        Bottle bottle3 = new WaterBottle();
        bottle3.fill();
        bottle3.drink();
        bottle3.clean();
        bottle3.close();
        bottle3.carry();
    }
}
