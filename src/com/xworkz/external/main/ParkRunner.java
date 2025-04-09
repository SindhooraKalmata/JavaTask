package com.xworkz.external.main;

import com.xworkz.external.Park;
import com.xworkz.external.casting.ParkCast;
import com.xworkz.external.internal.ChildrenPark;

public class ParkRunner {
    public static void main(String[] args) {
        Park park = new Park();
        park.openPark();
        park.provideWalkingTrack();
        park.maintainGreenery();
        park.provideSeatingArea();
        park.closePark();

        Park park1 = new ChildrenPark();
        park1.openPark();
        park1.provideWalkingTrack();
        park1.maintainGreenery();
        park1.provideSeatingArea();
        park1.closePark();

        Park park2 = new ChildrenPark();
        park2.openPark();
        park2.provideWalkingTrack();
        park2.maintainGreenery();
        park2.provideSeatingArea();
        park2.closePark();

        Park park3 = new ChildrenPark();
        park3.openPark();
        park3.provideWalkingTrack();
        park3.maintainGreenery();
        park3.provideSeatingArea();
        park3.closePark();

        ChildrenPark childrenPark=new ChildrenPark();
        childrenPark.watering();
        childrenPark.closePark();
        childrenPark.openPark();
        childrenPark.maintainGreenery();
        childrenPark.provideSeatingArea();
        childrenPark.provideWalkingTrack();

        ParkCast parkCast=new ParkCast();
        parkCast.apply(park);
        parkCast.apply(childrenPark);
    }
}
