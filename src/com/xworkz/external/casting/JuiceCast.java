package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Juice;
import com.xworkz.external.internal.AppleJuice;
import com.xworkz.external.internal.ZanduBalm;

public class JuiceCast {
    public void apply(Juice juice){
        juice.noOfBottle();
        juice.color();
        juice.cost();
        juice.quantity();
        juice.totalCost();

        if(juice instanceof AppleJuice){
            AppleJuice appleJuice=new AppleJuice();
            appleJuice.drink();
        }
    }
}
