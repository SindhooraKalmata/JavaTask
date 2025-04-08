package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Jam;
import com.xworkz.external.internal.Kissan;
import com.xworkz.external.internal.ZanduBalm;

public class JamCast {
    public void apply(Jam jam){
        jam.jamFlavour();
        jam.jamColour();
        jam.jamName();
        jam.quantity();
        jam.totalCost();

        if(jam instanceof Kissan){
            Kissan kissan=new Kissan();
            kissan.spread();
        }
    }
}
