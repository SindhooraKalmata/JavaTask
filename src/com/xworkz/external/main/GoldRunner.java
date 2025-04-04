package com.xworkz.external.main;

import com.xworkz.external.Mineral;
import com.xworkz.external.internal.Gold;

public class GoldRunner {
    public static void main(String[] args) {
        Mineral mineral=new Mineral();
        mineral.foundAt();
        mineral.name();
        mineral.place();
        mineral.qualityCheck();
        mineral.quantity();

        Mineral mineral1=new Gold();
        mineral1.name();
        mineral1.quantity();
        mineral1.foundAt();
        mineral1.place();
        mineral1.qualityCheck();

        Mineral mineral2=new Gold();
        mineral2.name();
        mineral2.quantity();
        mineral2.foundAt();
        mineral2.place();
        mineral2.qualityCheck();

        Mineral mineral3=new Gold();
        mineral3.name();
        mineral3.quantity();
        mineral3.foundAt();
        mineral3.place();
        mineral3.qualityCheck();
    }
}
