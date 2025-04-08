package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Box;
import com.xworkz.external.internal.CardboardBox;
import com.xworkz.external.internal.ZanduBalm;

public class BoxCast {
    public void apply(Box box){
        box.openBox();
        box.moveBox();
        box.closeBox();
        box.storeItems();
        box.checkSize();

        if(box instanceof CardboardBox){
            CardboardBox cardboardBox=new CardboardBox();
            cardboardBox.breaks();
        }
    }
}
