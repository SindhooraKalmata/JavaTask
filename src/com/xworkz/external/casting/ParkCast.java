package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Park;
import com.xworkz.external.internal.ChildrenPark;
import com.xworkz.external.internal.ZanduBalm;

public class ParkCast {
    public void apply(Park park){
       park.closePark();
       park.openPark();
       park.maintainGreenery();
       park.provideSeatingArea();
       park.provideWalkingTrack();

        if(park instanceof ChildrenPark){
            ChildrenPark childrenPark=new ChildrenPark();
            childrenPark.watering();
        }
    }
}
