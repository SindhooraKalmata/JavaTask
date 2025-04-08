package com.xworkz.external.internal;

import com.xworkz.external.Student;

public class Sindhu extends Student {
    public Sindhu() {
        super();
        System.out.println("no args const of Sindhu");
    }

    @Override
    public void name() {
        System.out.println("Running from child");
    }

    @Override
    public void branch() {
        System.out.println("Running from child");
    }

    @Override
    public void city() {
        System.out.println("Running from child");
    }

    @Override
    public void collage() {
        System.out.println("Running from child");
    }

    @Override
    public void usn() {
        System.out.println("Running from child");
    }
    public void attend(){
        System.out.println("Running from child");
    }
}
