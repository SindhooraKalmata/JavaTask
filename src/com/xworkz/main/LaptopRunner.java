package com.xworkz.main;

import com.xworkz.external.Laptop;
import com.xworkz.internal.Dell;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        laptop.laptopCost();
        laptop.brand();
        laptop.version();
        laptop.generation();
        laptop.display();

        Laptop laptop1=new Dell();
        laptop1.brand();
        laptop1.laptopCost();
        laptop1.display();
        laptop1.version();
        laptop1.generation();

        Laptop laptop2=new Dell();
        laptop2.brand();
        laptop2.laptopCost();
        laptop2.display();
        laptop2.version();
        laptop2.generation();

        Laptop laptop3=new Dell();
        laptop3.brand();
        laptop3.laptopCost();
        laptop3.display();
        laptop3.version();
        laptop3.generation();
    }
}
