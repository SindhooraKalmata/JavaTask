package com.xworkz.external.main;
import com.xworkz.external.Earphone;
import com.xworkz.external.casting.EarPhoneCast;
import com.xworkz.external.internal.Bluetooth;
import com.xworkz.external.internal.Wired;

public class EarphoneRunner {
        public static void main(String[]args){
            Earphone earphone=new Earphone();
            earphone.purchase();
            earphone.connect();
            earphone.mobile();
            earphone.device();
            earphone.share();

            Earphone earphone1=new Wired();
            earphone1.purchase();
            earphone1.connect();
            earphone1.mobile();
            earphone1.device();
            earphone1.share();

        Wired wired=new Wired();
        wired.disconnect();
        wired.connect();
        wired.device();
        wired.mobile();
        wired.share();
        wired.purchase();

            EarPhoneCast earPhoneCast=new EarPhoneCast();
                earPhoneCast.apply(earphone);
                earPhoneCast.apply(wired);
        }
    }
