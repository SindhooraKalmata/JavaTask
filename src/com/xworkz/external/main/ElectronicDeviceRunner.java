package com.xworkz.external.main;

import com.xworkz.external.ElectronicDevice;
import com.xworkz.external.internal.Smartphone;

public class ElectronicDeviceRunner {
    public static void main(String[] args) {
        ElectronicDevice electronicDevice=new ElectronicDevice();
        electronicDevice.brand();
        electronicDevice.color();
        electronicDevice.camera();
        electronicDevice.storage();
        electronicDevice.cost();

        ElectronicDevice electronicDevice1=new Smartphone();
        electronicDevice1.cost();
        electronicDevice1.storage();
        electronicDevice1.brand();
        electronicDevice1.camera();
        electronicDevice1.color();

        ElectronicDevice electronicDevice2=new Smartphone();
        electronicDevice2.cost();
        electronicDevice2.storage();
        electronicDevice2.brand();
        electronicDevice2.camera();
        electronicDevice2.color();

        ElectronicDevice electronicDevice3=new Smartphone();
        electronicDevice3.cost();
        electronicDevice3.storage();
        electronicDevice3.brand();
        electronicDevice3.camera();
        electronicDevice3.color();
    }
}
