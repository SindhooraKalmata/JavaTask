package com.xworkz.external.main;
import com.xworkz.external.Government;
import com.xworkz.external.internal.Democracy;

public class GovernmentRunner {
    public static void main(String[] args) {

        Government government = new Government();
        government.makeLaws();
        government.collectTaxes();
        government.enforceLaws();
        government.conductElections();
        government.provideService();

        Government government1 = new Democracy();
        government1.makeLaws();
        government1.collectTaxes();
        government1.enforceLaws();
        government1.conductElections();
        government1.provideService();

        Government government2 = new Democracy();
        government2.makeLaws();
        government2.collectTaxes();
        government2.enforceLaws();
        government2.conductElections();
        government2.provideService();

        Government government3 = new Democracy();
        government3.makeLaws();
        government3.collectTaxes();
        government3.enforceLaws();
        government3.conductElections();
        government3.provideService();

    }
}
