package com.xworkz.main;

import com.xworkz.external.Juice;
import com.xworkz.internal.AppleJuice;

public class JuiceRunner {
    public static void main(String[] args){
        Juice juice=new Juice();
        juice.color();
        juice.cost();
        juice.noOfBottle();
        juice.quantity();
        juice.totalCost();

        Juice juice1=new AppleJuice();
        juice1.totalCost();
        juice1.cost();
        juice1.quantity();
        juice1.color();
        juice1.noOfBottle();

        Juice juice2=new AppleJuice();
        juice2.totalCost();
        juice2.cost();
        juice2.quantity();
        juice2.color();
        juice2.noOfBottle();

        Juice juice3=new AppleJuice();
        juice3.totalCost();
        juice3.cost();
        juice3.quantity();
        juice3.color();
        juice3.noOfBottle();
    }
}
