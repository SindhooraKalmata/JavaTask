package com.xworkz.main;

import com.xworkz.external.Fish;
import com.xworkz.internal.Shark;

public class FishRunner {
    public static void main(String[] args) {
        Fish fish=new Fish();
        fish.age();
        fish.gender();
        fish.colour();
        fish.weight();
        fish.height();

        Fish fish1=new Shark();
        fish1.height();
        fish1.weight();
        fish1.gender();
        fish1.colour();
        fish1.age();

        Fish fish2=new Shark();
        fish2.height();
        fish2.weight();
        fish2.gender();
        fish2.colour();
        fish2.age();

        Fish fish3=new Shark();
        fish3.height();
        fish3.weight();
        fish2.gender();
        fish3.colour();
        fish3.age();
    }
}
