package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Bottle;
import com.xworkz.external.internal.WaterBottle;
import com.xworkz.external.internal.ZanduBalm;

public class BottleCast {
    public void apply(Bottle bottle){
        bottle.carry();
        bottle.clean();
        bottle.close();
        bottle.fill();
        bottle.drink();

        if(bottle instanceof WaterBottle){
            WaterBottle waterBottle=new WaterBottle();
            waterBottle.pour();
        }
    }
}
