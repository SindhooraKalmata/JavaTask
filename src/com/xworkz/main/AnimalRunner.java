package com.xworkz.main;

import com.xworkz.external.Animal;
import com.xworkz.internal.Horse;

public class AnimalRunner {
    public static void main(String[] args){
        Animal animal=new Animal();
        animal.weight();
        animal.colour();
        animal.age();
        animal.gender();
        animal.height();

        Animal animal1=new Horse();
        animal1.height();
        animal1.colour();
        animal1.gender();
        animal1.age();
        animal1.weight();

        Animal animal2=new Horse();
        animal2.weight();
        animal2.age();
        animal2.colour();
        animal2.gender();
        animal2.age();

        Animal animal3=new Horse();
        animal3.weight();
        animal3.age();
        animal3.colour();
        animal3.gender();
        animal3.age();
    }
}
