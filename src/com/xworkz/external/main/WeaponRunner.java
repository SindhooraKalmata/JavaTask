package com.xworkz.external.main;

import com.xworkz.external.Weapon;
import com.xworkz.external.internal.M416;

public class WeaponRunner {
    public static void main(String[] args) {
        Weapon weapon=new Weapon();
        weapon.weaponName();
        weapon.Brand();
        weapon.pieces();
        weapon.price();
        weapon.colour();

        Weapon weapon1=new M416();
        weapon1.colour();
        weapon1.price();
        weapon1.pieces();
        weapon1.weaponName();
        weapon1.Brand();

        Weapon weapon2=new M416();
        weapon2.colour();
        weapon2.price();
        weapon2.pieces();
        weapon2.weaponName();
        weapon2.Brand();

        Weapon weapon3=new M416();
        weapon3.colour();
        weapon3.price();
        weapon3.pieces();
        weapon3.weaponName();
        weapon3.Brand();
    }
}
