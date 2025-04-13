package com.xworkz.tostring.internal;

public class Engine {
    private String color;
    private int capacity;
    private String material;

    public Engine(String color, int capacity,String material){
        this.capacity=capacity;
        this.material=material;
        this.color=color;

    }
    @Override
    public String toString() {
        return "color is " + this.color + "material is " + this.material + " capacity is " + this.capacity;
    }
}
