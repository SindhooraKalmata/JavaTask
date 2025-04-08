package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Vegetable;
import com.xworkz.external.internal.LeafVeg;
import com.xworkz.external.internal.ZanduBalm;

public class VegetableCast {
    public void apply(Vegetable vegetable){
        vegetable.grow();
        vegetable.harvest();
        vegetable.nutrients();
        vegetable.pesticide();
        vegetable.water();

        if(vegetable instanceof LeafVeg){
            LeafVeg leafVeg=new LeafVeg();
            leafVeg.cultivate();
        }
    }
}
