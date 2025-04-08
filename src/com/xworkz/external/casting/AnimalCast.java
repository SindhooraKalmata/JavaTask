package com.xworkz.external.casting;

import com.xworkz.external.Animal;
import com.xworkz.external.internal.Horse;

public class AnimalCast {
    public void sounds(Animal animal) {
        animal.height();
        animal.age();
        animal.colour();
        animal.gender();
        animal.weight();

        if (animal instanceof Horse) {
            Horse horse = new Horse();
            horse.runs();
        }
    }
}
