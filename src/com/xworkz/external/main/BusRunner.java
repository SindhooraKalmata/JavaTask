package com.xworkz.external.main;

import com.xworkz.external.Bus;
import com.xworkz.external.casting.BusCast;
import com.xworkz.external.internal.SchoolBus;

public class BusRunner {
    public static void main(String[] args) {
        Bus bus=new Bus();
        bus.busType();
        bus.morningArrivalTime();
        bus.morningArrivalTime();
        bus.schoolName();
        bus.wheels();

        Bus bus1=new Bus();
        bus1.wheels();
        bus1.busType();
        bus1.eveningArrivalTime();
        bus1.morningArrivalTime();
        bus1.schoolName();

        Bus bus2=new Bus();
        bus2.wheels();
        bus2.busType();
        bus2.eveningArrivalTime();
        bus2.morningArrivalTime();
        bus2.schoolName();

        Bus bus3=new Bus();
        bus3.wheels();
        bus3.busType();
        bus3.eveningArrivalTime();
        bus3.morningArrivalTime();
        bus3.schoolName();

        SchoolBus schoolBus=new SchoolBus();
        schoolBus.speed();
        schoolBus.busType();
        schoolBus.eveningArrivalTime();
        schoolBus.wheels();
        schoolBus.schoolName();
        schoolBus.morningArrivalTime();

        BusCast busCast=new BusCast();
        busCast.apply(bus);
        busCast.apply(schoolBus);
    }
}
