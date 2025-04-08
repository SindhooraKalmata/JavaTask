package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.PG;
import com.xworkz.external.internal.LuxuryPG;
import com.xworkz.external.internal.ZanduBalm;

public class PGCast {
    public void apply(PG pg){
        pg.ensureSecurity();
        pg.manageRent();
        pg.offerFood();
        pg.provideRoom();
        pg.provideWiFi();

        if(pg instanceof LuxuryPG){
            LuxuryPG luxuryPG=new LuxuryPG();
            luxuryPG.booking();
        }
    }
}
