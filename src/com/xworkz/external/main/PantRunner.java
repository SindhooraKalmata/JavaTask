package com.xworkz.external.main;

import com.xworkz.external.Pant;
import com.xworkz.external.internal.JeansPant;

public class PantRunner {
    public static void main(String[] args) {
        Pant pant=new Pant();
        pant.pantColour();
        pant.pantCost();
        pant.clothType();
        pant.brand();
        pant.size();

        Pant pant1=new JeansPant();
        pant1.clothType();
        pant1.size();
        pant1.pantCost();
        pant1.brand();
        pant1.pantColour();

        Pant pant2=new JeansPant();
        pant2.clothType();
        pant2.size();
        pant2.pantCost();
        pant2.brand();
        pant2.pantColour();

        Pant pant3=new JeansPant();
        pant3.clothType();
        pant3.size();
        pant3.pantCost();
        pant3.brand();
        pant3.pantColour();
    }
}
