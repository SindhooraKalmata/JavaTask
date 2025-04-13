package com.xworkz.tostring.internal;

public class School {
    private String name;
    private int noOfSchools;
    private String event;

    public School(String name, int noOfSchools,String event){
        this.name=name;
        this.noOfSchools=noOfSchools;
        this.event=event;

    }
    @Override
    public String toString() {
        return "name is " + this.name + "no of Schools are " + this.noOfSchools + " event is " + this.event;
    }
}
