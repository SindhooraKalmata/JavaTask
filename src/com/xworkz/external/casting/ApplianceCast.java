package com.xworkz.external.casting;

import com.xworkz.external.Appliance;
import com.xworkz.external.internal.Television;

public class ApplianceCast {
    public void works(Appliance appliance){
        appliance.brand();
        appliance.cost();
        appliance.pieces();
        appliance.height();
        appliance.width();

        if (appliance instanceof Television){
            Television television=new Television();
            television.displays();
        }
    }
}
