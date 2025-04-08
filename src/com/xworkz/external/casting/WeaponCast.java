package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Weapon;
import com.xworkz.external.internal.M416;
import com.xworkz.external.internal.ZanduBalm;

public class WeaponCast {
    public void apply(Weapon weapon){
        weapon.weaponName();
        weapon.Brand();
        weapon.pieces();
        weapon.price();
        weapon.colour();

        if(weapon instanceof M416){
            M416 m416=new M416();
            m416.shoot();
        }
    }
}
