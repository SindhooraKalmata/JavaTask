package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Light;
import com.xworkz.external.internal.Bulb;
import com.xworkz.external.internal.ZanduBalm;

public class LightCast {
    public void apply(Light light){
        light.totalCost();
        light.cost();
        light.colour();
        light.size();
        light.pieces();

        if(light instanceof Bulb){
            Bulb bulb=new Bulb();
            bulb.breaks();
        }
    }
}
