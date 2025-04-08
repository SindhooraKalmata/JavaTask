package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.School;
import com.xworkz.external.internal.Nmkhps;
import com.xworkz.external.internal.ZanduBalm;

public class SchoolCast {
    public void apply(School school){
        school.place();
        school.name();
        school.fees();
        school.District();
        school.color();

        if(school instanceof Nmkhps){
            Nmkhps nmkhps=new Nmkhps();
            nmkhps.opens();
        }
    }
}
