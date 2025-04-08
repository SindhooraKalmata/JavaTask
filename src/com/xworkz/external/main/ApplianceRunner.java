package com.xworkz.external.main;

import com.xworkz.external.Appliance;
import com.xworkz.external.casting.ApplianceCast;
import com.xworkz.external.internal.Television;

public class ApplianceRunner {
    public static void main(String[] args) {
        Appliance appliance=new Appliance();
        appliance.brand();
        appliance.cost();
        appliance.height();
        appliance.pieces();
        appliance.width();

        Appliance appliance1=new Television();
        appliance1.width();
        appliance1.height();
        appliance1.pieces();
        appliance1.cost();
        appliance1.brand();

        Appliance appliance2=new Television();
        appliance2.width();
        appliance2.height();
        appliance2.pieces();
        appliance2.cost();
        appliance2.brand();

        Appliance appliance3=new Television();
        appliance3.width();
        appliance3.height();
        appliance3.pieces();
        appliance3.cost();
        appliance3.brand();

        Television television=new Television();
        television.width();
        television.pieces();
        television.cost();
        television.height();
        television.brand();

        ApplianceCast applianceCast=new ApplianceCast();
        applianceCast.works(appliance);
        applianceCast.works(television);
    }
}
