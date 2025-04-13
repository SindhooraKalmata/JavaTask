package com.xworkz.tostring.internal;

public class Table {
    private String color;
    private int legs;
    private String material;

    public Table(String color, int legs,String material){
        this.legs=legs;
        this.material=material;
        this.color=color;

    }
    @Override
    public String toString() {
        return "color is " + this.color + "material is " + this.material + " legs are " + this.legs;
    }
}
