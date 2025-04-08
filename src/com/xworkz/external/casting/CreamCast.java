package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Cream;
import com.xworkz.external.internal.ChocolateCream;
import com.xworkz.external.internal.ZanduBalm;

public class CreamCast {
    public void apply(Cream cream){
        cream.applyCream();
        cream.packaging();
        cream.provideMoisture();
        cream.scent();
        cream.soothingEffect();

        if(cream instanceof ChocolateCream){
            ChocolateCream chocolateCream=new ChocolateCream();
            chocolateCream.spread();
        }
    }
}
