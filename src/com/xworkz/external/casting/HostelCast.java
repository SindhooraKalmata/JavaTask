package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Hostel;
import com.xworkz.external.internal.Vcvr;
import com.xworkz.external.internal.ZanduBalm;

public class HostelCast {
    public void apply(Hostel hostel){
        hostel.noOfRooms();
        hostel.fees();
        hostel.floors();
        hostel.Name();
        hostel.place();

        if(hostel instanceof Vcvr){
            Vcvr vcvr=new Vcvr();
            vcvr.opens();
        }
    }
}
