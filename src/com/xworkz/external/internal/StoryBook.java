package com.xworkz.external.internal;

import com.xworkz.external.Book;

public class StoryBook extends Book {
    public StoryBook() {
        super();
        System.out.println("no args const of Story book");
    }

    @Override
    public void colour() {
        System.out.println("Running from child");
    }

    @Override
    public void price() {
        System.out.println("Running from child");
    }

    @Override
    public void size() {
        System.out.println("Running from child");
    }

    @Override
    public void copies() {
        System.out.println("Running from child");
    }

    @Override
    public void pages() {
        System.out.println("Running from child");
    }
    public void buy(){
        System.out.println("Running from child");
    }
}
