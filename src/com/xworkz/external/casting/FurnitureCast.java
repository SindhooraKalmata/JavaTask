package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Furniture;
import com.xworkz.external.internal.Table;
import com.xworkz.external.internal.ZanduBalm;

public class FurnitureCast {
    public void apply(Furniture furniture){
        furniture.cost();
        furniture.furnitureName();
        furniture.pieces();
        furniture.wood();
        furniture.shape();

        if(furniture instanceof Table){
            Table table=new Table();
            table.breaks();
        }
    }
}
