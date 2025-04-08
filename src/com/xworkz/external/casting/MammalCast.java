package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Mammal;
import com.xworkz.external.internal.Cow;
import com.xworkz.external.internal.ZanduBalm;

public class MammalCast {
    public void apply(Mammal mammal){
        mammal.age();
        mammal.cost();
        mammal.breed();
        mammal.health();
        mammal.name();

        if(mammal instanceof Cow){
            Cow cow=new Cow();
            cow.sounds();
        }
    }
}
