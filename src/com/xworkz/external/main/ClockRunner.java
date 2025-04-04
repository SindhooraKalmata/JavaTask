package com.xworkz.external.main;

import com.xworkz.external.Clock;
import com.xworkz.external.internal.Casio;

public class ClockRunner {
    public static void main(String[] args) {
        Clock clock1 = new Casio();
        clock1.type();
        clock1.duration();
        clock1.lens();
        clock1.color();
        clock1.quality();

        System.out.println("--------------------------------");

        Casio casio = new Casio();
        casio.type();
        casio.duration();
        casio.lens();
        casio.color();
        casio.quality();
    }
}
