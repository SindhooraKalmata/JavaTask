package com.xworkz.external.main;

import com.xworkz.external.Floor;
import com.xworkz.external.casting.FloorCast;
import com.xworkz.external.internal.Granite;

public class FloorRunner {
    public static void main(String[] args) {
        Floor floor = new Floor();
        floor.floorType();
        floor.floorColour();
        floor.flooringShop();
        floor.noOfGranite();
        floor.pricePerFeet();

        Floor floor1 = new Granite();
        floor1.pricePerFeet();
        floor1.floorType();
        floor1.noOfGranite();
        floor1.floorColour();
        floor1.flooringShop();

        Floor floor2 = new Granite();
        floor2.pricePerFeet();
        floor2.floorType();
        floor2.noOfGranite();
        floor2.floorColour();
        floor2.flooringShop();

        Floor floor3 = new Granite();
        floor3.pricePerFeet();
        floor3.floorType();
        floor3.noOfGranite();
        floor3.floorColour();
        floor3.flooringShop();

        Granite granite=new Granite();
        granite.breaks();
        granite.floorColour();
        granite.flooringShop();
        granite.floorType();
        granite.noOfGranite();
        granite.pricePerFeet();

        FloorCast floorCast=new FloorCast();
        floorCast.apply(floor);
        floorCast.apply(granite);
    }
}
