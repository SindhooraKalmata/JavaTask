package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.internal.ZanduBalm;

public class BalmCast {
    public void apply(Balm balm){
        balm.balmName();
        balm.balmColour();
        balm.balmType();
        balm.size();
        balm.cost();

        if(balm instanceof ZanduBalm){
            ZanduBalm zanduBalm=new ZanduBalm();
            zanduBalm.relief();
        }
    }
}
