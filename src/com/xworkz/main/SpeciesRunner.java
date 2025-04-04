package com.xworkz.main;
import com.xworkz.external.Species;
import com.xworkz.internal.Elf;
public class SpeciesRunner {
    public static void main(String[] args) {
        Species species = new Species();
        species.alive();
        species.attack();
        species.defend();
        species.move();
        species.speak();

        Species species1 = new Elf();
        species1.speak();
        species1.move();
        species1.defend();
        species1.attack();
        species1.alive();

        Species species2 = new Elf();
        species2.alive();
        species2.attack();
        species2.defend();
        species2.move();
        species2.speak();

        Species species3 = new Elf();
        species3.speak();
        species2.move();
        species2.defend();
        species2.attack();
        species2.alive();

        Elf elf = new Elf();
        elf.alive();
        elf.defend();
        elf.speak();
        elf.attack();
        elf.move();
    }
}
