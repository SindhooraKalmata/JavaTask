package com.xworkz.external.main;

import com.xworkz.external.Vehicle;
import com.xworkz.external.casting.VehicleCast;
import com.xworkz.external.internal.Truck;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.accelerate();
        vehicle.brake();
        vehicle.speed();
        vehicle.start();
        vehicle.stop();

        Vehicle vehicle1 = new Truck();
        vehicle1.stop();
        vehicle1.start();
        vehicle1.brake();
        vehicle1.accelerate();
        vehicle1.speed();

        Vehicle vehicle2 = new Vehicle();
        vehicle2.speed();
        vehicle2.accelerate();
        vehicle2.stop();
        vehicle2.start();
        vehicle2.brake();

        Vehicle vehicle3 = new Truck();
        vehicle3.brake();
        vehicle3.stop();
        vehicle3.start();
        vehicle3.speed();
        vehicle3.accelerate();

        Truck truck=new Truck();
        truck.brake();
        truck.stop();
        truck.accelerate();
        truck.speed();
        truck.start();
        truck.moves();

        VehicleCast vehicleCast=new VehicleCast();
        vehicleCast.apply(vehicle);
        vehicleCast.apply(truck);

    }
}
