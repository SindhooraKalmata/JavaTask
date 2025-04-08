package com.xworkz.external.casting;

import com.xworkz.external.PowerBank;
import com.xworkz.external.internal.Anker;

public class PowerBankCast {
    public void cost(PowerBank powerBank){
        powerBank.charge();
        powerBank.connect();
        powerBank.type();
        powerBank.wire();
        powerBank.recharge();

        if (powerBank instanceof Anker){
            Anker anker=new Anker();
            anker.battery();
        }
    }
}
