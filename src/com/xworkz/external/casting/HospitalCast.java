package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Hospital;
import com.xworkz.external.internal.SpecializedHospital;
import com.xworkz.external.internal.ZanduBalm;

public class HospitalCast {
    public void apply(Hospital hospital){
        hospital.admitPatient();
        hospital.conductSurgery();
        hospital.dischargePatient();
        hospital.issueMedicine();
        hospital.provideTreatment();

        if(hospital instanceof SpecializedHospital){
            SpecializedHospital specializedHospital=new SpecializedHospital();
            specializedHospital.token();
        }
    }
}
