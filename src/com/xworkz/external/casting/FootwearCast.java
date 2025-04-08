package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.FootWear;
import com.xworkz.external.internal.Chappal;
import com.xworkz.external.internal.ZanduBalm;

public class FootwearCast {
    public void apply(FootWear footWear){
        footWear.brand();
        footWear.footwearType();
        footWear.cost();
        footWear.footwearColour();
        footWear.material();

        if(footWear instanceof Chappal){
            Chappal chappal=new Chappal();
            chappal.wear();
        }
    }
}
