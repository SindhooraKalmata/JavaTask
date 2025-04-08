package com.xworkz.external.internal;

import com.xworkz.external.Hospital;

public class SpecializedHospital extends Hospital {
    public SpecializedHospital() {
        super();
        System.out.println("SpecializedHospital is a subclass");
    }

    @Override
    public void admitPatient() {
        System.out.println("Running from child");
    }

    @Override
    public void conductSurgery() {
        System.out.println("Running from child");
    }

    @Override
    public void dischargePatient() {
        System.out.println("Running from child");
    }

    @Override
    public void issueMedicine() {
        System.out.println("Running from child");
    }

    @Override
    public void provideTreatment() {
        System.out.println("Running from child");
    }
    public void token(){
        System.out.println("Running from child");
    }
}
