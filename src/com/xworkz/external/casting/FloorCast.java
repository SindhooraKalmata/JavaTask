package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Floor;
import com.xworkz.external.internal.Granite;
import com.xworkz.external.internal.ZanduBalm;

public class FloorCast {
    public void apply(Floor floor){
        floor.flooringShop();
        floor.floorColour();
        floor.floorType();
        floor.noOfGranite();
        floor.noOfGranite();

        if(floor instanceof Granite){
            Granite granite=new Granite();
            granite.breaks();
        }
    }
}
