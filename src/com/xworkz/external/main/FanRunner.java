package com.xworkz.external.main;

import com.xworkz.external.internal.CeilingFan;
import com.xworkz.external.Fan;

public class FanRunner {

    public static void main(String[] args) {


        Fan fan1 = new Fan();
        fan1.startFan();
        fan1.stopFan();
        fan1.setSpeed();
        fan1.oscillate();
        fan1.displayType();


        Fan fan2 = new CeilingFan();
        fan2.startFan();
        fan2.stopFan();
        fan2.setSpeed();
        fan2.oscillate();
        fan2.displayType();


        Fan fan3 = new CeilingFan();
        fan3.startFan();
        fan3.stopFan();
        fan3.setSpeed();
        fan3.oscillate();
        fan3.displayType();

    }

}
