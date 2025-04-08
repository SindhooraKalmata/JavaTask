package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Pant;
import com.xworkz.external.internal.JeansPant;
import com.xworkz.external.internal.ZanduBalm;

public class PantCast {
    public void apply(Pant pant){
        pant.pantColour();
        pant.pantCost();
        pant.brand();
        pant.size();
        pant.clothType();

        if(pant instanceof JeansPant){
            JeansPant jeansPant=new JeansPant();
            jeansPant.wear();
        }
    }
}
