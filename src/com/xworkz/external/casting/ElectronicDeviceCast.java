package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.ElectronicDevice;
import com.xworkz.external.internal.Smartphone;


public class ElectronicDeviceCast {
    public void apply(ElectronicDevice electronicDevice){
        electronicDevice.color();
        electronicDevice.camera();
        electronicDevice.storage();
        electronicDevice.cost();
        electronicDevice.brand();

        if(electronicDevice instanceof Smartphone){
            Smartphone smartphone=new Smartphone();
            smartphone.switchOff();
        }
    }
}
