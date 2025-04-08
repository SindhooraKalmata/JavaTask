package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Instrument;
import com.xworkz.external.internal.Guitar;
import com.xworkz.external.internal.ZanduBalm;

public class InstrumentCast {
    public void apply(Instrument instrument){
        instrument.cords();
        instrument.keys();
        instrument.play();
        instrument.strings();

        if(instrument instanceof Guitar){
            Guitar guitar=new Guitar();
            guitar.plays();
        }
    }
}
