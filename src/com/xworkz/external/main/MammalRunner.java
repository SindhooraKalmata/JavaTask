package com.xworkz.external.main;

import com.xworkz.external.Mammal;
import com.xworkz.external.internal.Cow;

public class MammalRunner {
    public static void main(String[] args) {
        Mammal mammal=new Mammal();
        mammal.age();
        mammal.cost();
        mammal.breed();
        mammal.health();
        mammal.name();

        Mammal mammal1=new Cow();
        mammal1.name();
        mammal1.health();
        mammal1.breed();
        mammal1.cost();
        mammal1.age();

        Mammal mammal2=new Cow();
        mammal2.name();
        mammal2.health();
        mammal2.breed();
        mammal2.cost();
        mammal2.age();

        Mammal mammal3=new Cow();
        mammal3.name();
        mammal3.health();
        mammal3.breed();
        mammal3.cost();
        mammal3.age();
    }
}
