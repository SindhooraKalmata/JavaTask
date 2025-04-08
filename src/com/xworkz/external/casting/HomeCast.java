package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Home;
import com.xworkz.external.internal.Apartment;
import com.xworkz.external.internal.ZanduBalm;

public class HomeCast {
    public void apply(Home home){
        home.hasGarden();
        home.hasKitchen();
        home.hasRooms();
        home.provideShelter();
        home.secureDoors();

        if(home instanceof Apartment){
            Apartment apartment=new Apartment();
            apartment.payRent();
        }
    }
}
