package com.xworkz.external.main;

import com.xworkz.external.Plant;
import com.xworkz.external.casting.PlantCast;
import com.xworkz.external.internal.Rose;

public class PlantRunner {
    public static void main(String[] args) {
        Plant plant=new Plant();
        plant.name();
        plant.age();
        plant.height();
        plant.colour();
        plant.noOfRoses();

        Plant plant1=new Rose();
        plant1.name();
        plant1.colour();
        plant1.noOfRoses();
        plant1.age();
        plant1.height();

        Plant plant2=new Rose();
        plant2.name();
        plant2.colour();
        plant2.noOfRoses();
        plant2.age();
        plant2.height();

        Plant plant3=new Rose();
        plant3.name();
        plant3.colour();
        plant3.noOfRoses();
        plant3.age();
        plant3.height();

        Rose rose=new Rose();
        rose.grows();
        rose.age();
        rose.name();
        rose.height();
        rose.noOfRoses();

        PlantCast plantCast=new PlantCast();
        plantCast.apply(plant);
        plantCast.apply(rose);
    }
}
