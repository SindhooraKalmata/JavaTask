package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Insect;
import com.xworkz.external.internal.ButterFly;
import com.xworkz.external.internal.ZanduBalm;

public class InsectCast {
    public void apply(Insect insect){
        insect.eyeColor();
        insect.age();
        insect.legs();
        insect.name();
        insect.wings();

        if(insect instanceof ButterFly){
            ButterFly butterFly=new ButterFly();
            butterFly.flies();
        }
    }
}
