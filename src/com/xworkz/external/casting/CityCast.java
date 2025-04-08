package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.City;
import com.xworkz.external.internal.Bangalore;
import com.xworkz.external.internal.ZanduBalm;

public class CityCast {
    public void apply(City city){
        city.population();
        city.shop();
        city.travel();
        city.type();
        city.trees();

        if(city instanceof Bangalore){
            Bangalore bangalore=new Bangalore();
            bangalore.raining();
        }
    }
}
