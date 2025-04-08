package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Cloth;
import com.xworkz.external.internal.CottonCloth;
import com.xworkz.external.internal.ZanduBalm;

public class ClothCast {
    public void apply(Cloth cloth){
        cloth.colourOfCloth();
        cloth.clothType();
        cloth.measurement();
        cloth.totalCost();
        cloth.costPerMeter();

        if(cloth instanceof CottonCloth){
            CottonCloth cottonCloth=new CottonCloth();
            cottonCloth.wear();
        }
    }
}
