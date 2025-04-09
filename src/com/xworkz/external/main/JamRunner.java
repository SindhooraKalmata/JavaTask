package com.xworkz.external.main;

import com.xworkz.external.Appliance;
import com.xworkz.external.Jam;
import com.xworkz.external.casting.JamCast;
import com.xworkz.external.casting.JuiceCast;
import com.xworkz.external.internal.AppleJuice;
import com.xworkz.external.internal.Kissan;

public class JamRunner {
    public static void main(String[] args) {
        Jam jam=new Jam();
        jam.jamColour();
        jam.jamFlavour();
        jam.jamName();
        jam.quantity();
        jam.totalCost();

        Jam jam1=new Kissan();
        jam1.totalCost();
        jam1.jamName();
        jam1.jamColour();
        jam1.jamFlavour();
        jam1.quantity();

        Jam jam2=new Kissan();
        jam2.totalCost();
        jam2.jamName();
        jam2.jamColour();
        jam2.jamFlavour();
        jam2.quantity();

        Jam jam3=new Kissan();
        jam3.totalCost();
        jam3.jamName();
        jam3.jamColour();
        jam3.jamFlavour();
        jam3.quantity();

        Kissan kissan=new Kissan();
        kissan.spread();
        kissan.jamColour();
        kissan.jamFlavour();
        kissan.jamName();
        kissan.totalCost();
        kissan.quantity();

        JamCast jamCast=new JamCast();
        jamCast.apply(jam);
        jamCast.apply(kissan);
    }
}
