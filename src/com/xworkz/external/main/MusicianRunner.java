package com.xworkz.external.main;

import com.xworkz.external.Musician;
import com.xworkz.external.internal.CharanRaj;

public class MusicianRunner {
    public static void main(String[] args) {
        Musician musician=new Musician();
        musician.name();
        musician.favSong();
        musician.movie();
        musician.noOfMovies();
        musician.language();

        Musician musician1=new CharanRaj();
        musician1.language();
        musician1.movie();
        musician1.name();
        musician1.favSong();
        musician1.noOfMovies();

        Musician musician2=new CharanRaj();
        musician2.language();
        musician2.movie();
        musician2.name();
        musician2.favSong();
        musician2.noOfMovies();

        Musician musician3=new CharanRaj();
        musician3.language();
        musician3.movie();
        musician3.name();
        musician3.favSong();
        musician3.noOfMovies();
    }
}
