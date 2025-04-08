package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Seminar;
import com.xworkz.external.internal.Techy;
import com.xworkz.external.internal.ZanduBalm;

public class SeminarCast {
    public void apply(Seminar seminar){
        seminar.date();
        seminar.schedule();
        seminar.student();
        seminar.time();
        seminar.topic();

        if(seminar instanceof Techy){
            Techy techy=new Techy();
            techy.prepare();
        }
    }
}
