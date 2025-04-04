package com.xworkz.main;
import com.xworkz.external.Earphone;
import com.xworkz.internal.Bluetooth;
import com.xworkz.internal.Wired;

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
        }
    }
