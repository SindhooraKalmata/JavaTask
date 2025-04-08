package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Earphone;
import com.xworkz.external.internal.Wired;
import com.xworkz.external.internal.ZanduBalm;

public class EarPhoneCast {
    public void apply(Earphone earphone){
        earphone.connect();
        earphone.device();
        earphone.mobile();
        earphone.purchase();
        earphone.share();

        if(earphone instanceof Wired){
            Wired wired=new Wired();
            wired.disconnect();
        }
    }
}
