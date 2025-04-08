package com.xworkz.external.casting;

import com.xworkz.external.Bag;
import com.xworkz.external.Balm;
import com.xworkz.external.internal.SchoolBag;
import com.xworkz.external.internal.ZanduBalm;

public class BagCast {
    public void apply(Bag bag){
        bag.carryBag();
        bag.openBag();
        bag.zipBag();
        bag.checkCapacity();
        bag.storeItems();

        if(bag instanceof SchoolBag){
            SchoolBag schoolBag=new SchoolBag();
            schoolBag.buy();
        }
    }
}
