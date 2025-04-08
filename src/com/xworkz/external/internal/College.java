package com.xworkz.external.internal;

import com.xworkz.external.Education;

public class College extends Education {
    public College(){
        super();
        System.out.println("no-argu is running");
    }

    @Override
    public void activity() {
        System.out.println("Running from child");
    }

    @Override
    public void certificates() {
        System.out.println("Running from child");
    }

    @Override
    public void events() {
        System.out.println("Running from child");
    }

    @Override
    public void exams() {
        System.out.println("Running from child");
    }

    @Override
    public void teach() {
        System.out.println("Running from child");
    }
    public void sport(){
        System.out.println("Running from child");
    }
}
