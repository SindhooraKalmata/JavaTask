package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Wire;
import com.xworkz.external.internal.ElectricWire;
import com.xworkz.external.internal.ZanduBalm;

public class WireCast {
    public void apply(Wire wire){
        wire.rollWire();
        wire.checkInsulation();
        wire.conductElectricity();
        wire.connectDevices();
        wire.measureLength();

        if(wire instanceof ElectricWire){
            ElectricWire electricWire=new ElectricWire();
            electricWire.connect();
        }
    }
}
