package com.xworkz.external.main;

import com.xworkz.external.City;
import com.xworkz.external.casting.CityCast;
import com.xworkz.external.internal.Bangalore;

public class CityRunner {
    public static void main(String[] args) {
        City city1 = new Bangalore();
        city1.type();
        city1.shop();
        city1.travel();
        city1.trees();
        city1.population();

        Bangalore bangalore = new Bangalore();
        bangalore.type();
        bangalore.shop();
        bangalore.travel();
        bangalore.trees();
        bangalore.population();

        CityCast cityCast=new CityCast();
        cityCast.apply(city1);
        cityCast.apply(bangalore);
    }
}