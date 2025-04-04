package com.xworkz.external.main;

import com.xworkz.external.Application;
import com.xworkz.external.internal.Whatsapp;

public class ApplicationRunner {
    public static void main(String[] args) {
        Application application=new Application();
        application.AppName();
        application.available();
        application.iconColour();
        application.storage();
        application.version();

        Application application1=new Whatsapp();
        application1.AppName();
        application1.version();
        application1.storage();
        application1.iconColour();
        application1.available();

        Application application2=new Whatsapp();
        application2.AppName();
        application2.version();
        application2.storage();
        application2.iconColour();
        application2.available();

        Application application3=new Whatsapp();
        application3.AppName();
        application3.version();
        application3.storage();
        application3.iconColour();
        application3.available();
    }
}
