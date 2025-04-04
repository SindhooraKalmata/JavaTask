package com.xworkz.external.main;

import com.xworkz.external.internal.Nmkhps;
import com.xworkz.external.School;

public class SchoolRunner {
    public static void main(String[] args){
        School school=new School();
        school.color();
        school.fees();
        school.District();
        school.name();
        school.place();

       School school1=new Nmkhps();
       school1.place();
       school1.name();
       school1.fees();
       school1.color();
       school1.District();

       School school2=new Nmkhps();
       school2.District();
       school2.fees();
       school2.color();
       school2.name();
       school2.place();


    }
}
