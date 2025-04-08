package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Device;
import com.xworkz.external.internal.Phone;
import com.xworkz.external.internal.Smartphone;
import com.xworkz.external.internal.ZanduBalm;

public class DeviceCast {
    public void apply(Device device){
        device.call();
        device.message();
        device.playGames();
        device.track();
        device.videoCall();

        if(device instanceof Phone){
            Phone phone=new Phone();
            phone.switchOff();
        }
    }
}
