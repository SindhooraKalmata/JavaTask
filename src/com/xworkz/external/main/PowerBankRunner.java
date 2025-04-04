package com.xworkz.external.main;
import com.xworkz.external.PowerBank;
import com.xworkz.external.internal.Anker;
public class PowerBankRunner {
    public static void main(String[] args) {
        PowerBank powerBank = new PowerBank();
        powerBank.type();
        powerBank.charge();
        powerBank.recharge();
        powerBank.wire();
        powerBank.connect();

        System.out.println("--------------------------------");

        PowerBank powerBank1 = new PowerBank();
        powerBank1.type();
        powerBank1.charge();
        powerBank1.recharge();
        powerBank1.wire();
        powerBank1.connect();
    }
}
