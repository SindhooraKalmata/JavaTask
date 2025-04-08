package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Bus;
import com.xworkz.external.internal.SchoolBus;
import com.xworkz.external.internal.ZanduBalm;

public class BusCast {
    public void apply(Bus bus){
        bus.schoolName();
        bus.busType();
        bus.morningArrivalTime();
        bus.wheels();
        bus.eveningArrivalTime();

        if(bus instanceof SchoolBus){
            SchoolBus schoolBus=new SchoolBus();
            schoolBus.speed();
        }
    }
}
