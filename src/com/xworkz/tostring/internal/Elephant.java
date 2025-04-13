package com.xworkz.tostring.internal;

public class Elephant {
    private String color;
    private int age;
    private String food;

    public Elephant(String color, int age,String food){
        this.age=age;
        this.food=food;
        this.color=color;

    }
    @Override
    public String toString() {
        return "color is " + this.color + "material is " + this.age + " capacity is " + this.food;
    }
}