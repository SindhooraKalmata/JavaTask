package com.xworkz.tostring.internal;

public class Flower {
    private String color;
    private int petals;
    private String name;

    public Flower(String color, int petals,String name){
        this.name=name;
        this.petals=petals;
        this.color=color;

    }
    @Override
    public String toString() {
        return "color is " + this.color + "petals are " + this.petals + " name is " + this.name;
    }
}
