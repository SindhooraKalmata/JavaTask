package com.xworkz.tostring.internal;

public class Fan {
    private String color;
    private int wings;
    private String brand;

    public Fan(String color, int wings,String brand){
        this.wings=wings;
        this.brand=brand;
        this.color=color;

    }
    @Override
    public String toString() {
        return "color is " + this.color + "wings are " + this.wings + " brand is " + this.brand;
    }
}
