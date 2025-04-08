package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Moisturiser;
import com.xworkz.external.internal.Himalaya;
import com.xworkz.external.internal.ZanduBalm;

public class MoisturizerCast {
    public void apply(Moisturiser moisturiser){
        moisturiser.nourish();
        moisturiser.name();
        moisturiser.cost();
        moisturiser.piece();
        moisturiser.quantity();

        if(moisturiser instanceof Himalaya){
            Himalaya himalaya=new Himalaya();
            himalaya.apply();
        }
    }
}
