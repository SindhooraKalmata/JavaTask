package com.xworkz.main;

import com.xworkz.external.Station;
import com.xworkz.internal.PoliceStation;

public class StationRunner {
    public static void main(String[] args) {
        Station station=new Station();
        station.city();
        station.stationType();
        station.noOfOfficers();
        station.openTime();
        station.place();

        Station station1=new PoliceStation();
        station1.place();
        station1.openTime();
        station1.city();
        station1.stationType();
        station1.noOfOfficers();

        Station station2=new PoliceStation();
        station2.place();
        station2.openTime();
        station2.city();
        station2.stationType();
        station2.noOfOfficers();

        Station station3=new PoliceStation();
        station3.place();
        station3.openTime();
        station3.city();
        station3.stationType();
        station3.noOfOfficers();
    }
}
