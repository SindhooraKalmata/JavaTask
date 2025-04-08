package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Vehicle;
import com.xworkz.external.internal.Truck;
import com.xworkz.external.internal.ZanduBalm;

public class VehicleCast {
    public void apply(Vehicle vehicle){
        vehicle.accelerate();
        vehicle.brake();
        vehicle.speed();
        vehicle.stop();
        vehicle.start();

        if(vehicle instanceof Truck){
            Truck truck=new Truck();
            truck.brake();
        }
    }
}
