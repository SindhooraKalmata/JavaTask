package com.xworkz.external.main;

import com.xworkz.external.Animal;
import com.xworkz.external.Hostel;
import com.xworkz.external.Juice;
import com.xworkz.external.internal.Horse;
import com.xworkz.external.internal.Vcvr;

public class HostelRunner {
    public static void main(String[] args){
        Hostel hostel=new Hostel();
        hostel.fees();
        hostel.floors();
        hostel.Name();
        hostel.noOfRooms();
        hostel.place();

        Hostel hostel1=new Vcvr();
        hostel1.place();
        hostel1.Name();
        hostel1.fees();
        hostel1.floors();
        hostel1.noOfRooms();

        Hostel hostel2=new Vcvr();
        hostel2.place();
        hostel2.Name();
        hostel2.fees();
        hostel2.floors();
        hostel2.noOfRooms();

        Hostel hostel3=new Vcvr();
        hostel3.place();
        hostel3.Name();
        hostel3.fees();
        hostel3.floors();
        hostel3.noOfRooms();
    }
}
