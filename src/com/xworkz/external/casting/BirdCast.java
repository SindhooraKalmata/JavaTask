package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Bird;
import com.xworkz.external.internal.Crow;
import com.xworkz.external.internal.ZanduBalm;

public class BirdCast {
    public void apply(Bird bird){
        bird.age();
        bird.colour();
        bird.height();
        bird.gender();
        bird.weight();

        if(bird instanceof Crow){
            Crow crow=new Crow();
            crow.layEgg();
        }
    }
}
