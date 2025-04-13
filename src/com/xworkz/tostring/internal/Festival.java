package com.xworkz.tostring.internal;

public class Festival {
    private String name;
    private int daysToGo;
    private String month;

    public Festival(String name, int daysToGo,String month){
        this.name=name;
        this.daysToGo=daysToGo;
        this.month=month;

    }
    @Override
    public String toString() {
        return "Name is " + this.name + "days to go is " + this.daysToGo + " month is " + this.month;
    }
}
