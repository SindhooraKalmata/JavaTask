package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Fish;
import com.xworkz.external.internal.Shark;
import com.xworkz.external.internal.ZanduBalm;

public class FishCast {
    public void apply(Fish fish){
        fish.age();
        fish.gender();
        fish.colour();
        fish.weight();
        fish.height();

        if(fish instanceof Shark){
            Shark shark=new Shark();
            shark.swims();
        }
    }
}
