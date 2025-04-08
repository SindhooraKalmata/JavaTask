package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Government;
import com.xworkz.external.internal.Democracy;
import com.xworkz.external.internal.ZanduBalm;

public class GovernmentCast {
    public void apply(Government government){
        government.collectTaxes();
        government.conductElections();
        government.enforceLaws();
        government.makeLaws();
        government.provideService();

        if(government instanceof Democracy){
            Democracy democracy=new Democracy();
            democracy.announce();
        }
    }
}
