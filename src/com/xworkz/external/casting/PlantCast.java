package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Plant;
import com.xworkz.external.internal.Rose;
import com.xworkz.external.internal.ZanduBalm;

public class PlantCast {
    public void apply(Plant plant){
        plant.height();
        plant.age();
        plant.noOfRoses();
        plant.colour();
        plant.name();

        if(plant instanceof Rose){
            Rose rose=new Rose();
            rose.grows();
        }
    }
}
