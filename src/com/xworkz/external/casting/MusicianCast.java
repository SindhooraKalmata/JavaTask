package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Musician;
import com.xworkz.external.internal.CharanRaj;
import com.xworkz.external.internal.ZanduBalm;

public class MusicianCast {
    public void apply(Musician musician){
       musician.noOfMovies();
       musician.name();
       musician.favSong();
       musician.movie();
       musician.language();

        if(musician instanceof CharanRaj){
            CharanRaj charanRaj=new CharanRaj();
            charanRaj.sings();
        }
    }
}
