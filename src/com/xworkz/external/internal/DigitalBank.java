package com.xworkz.external.internal;

import com.xworkz.external.Bank;

public class DigitalBank extends Bank {
    public DigitalBank() {
        super();
        System.out.println("DigitalBank is a subclass");
    }

    @Override
    public void closeAccount() {
        System.out.println("Running from child");
    }

    @Override
    public void depositMoney() {
        System.out.println("Running from child");
    }

    @Override
    public void openAccount() {
        System.out.println("Running from child");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Running from child");
    }

    @Override
    public void provideLoan() {
        System.out.println("Running from child");
    }
    public void closed(){
        System.out.println("Bank is closed");
    }
}
