package com.xworkz.external.internal;

import com.xworkz.external.Musician;

public class CharanRaj extends Musician {
    public CharanRaj(){
        super();
        System.out.println("Musician is Charan Raj");
    }

    @Override
    public void name() {
        System.out.println("Running from child");
    }

    @Override
    public void favSong() {
        System.out.println("Running from child");
    }

    @Override
    public void language() {
        System.out.println("Running from child");
    }

    @Override
    public void movie() {
        System.out.println("Running from child");
    }

    @Override
    public void noOfMovies() {
        System.out.println("Running from child");
    }
    public void sings(){
        System.out.println("Running from child");
    }
}
