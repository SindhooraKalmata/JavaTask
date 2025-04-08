package com.xworkz.external.main;

import com.xworkz.external.Bird;
import com.xworkz.external.casting.BirdCast;
import com.xworkz.external.internal.Crow;

public class BirdRunner {
    public static void main(String[] args){
        Bird bird=new Bird();
        bird.colour();
        bird.height();
        bird.age();
        bird.gender();
        bird.weight();

        Bird bird1=new Crow();
        bird1.age();
        bird1.colour();
        bird1.gender();
        bird1.height();
        bird1.weight();

        Bird bird2=new Crow();
        bird2.weight();
        bird2.height();
        bird2.colour();
        bird2.gender();
        bird2.age();

        Bird bird3=new Crow();
        bird3.weight();
        bird3.height();
        bird3.colour();
        bird3.gender();
        bird3.age();

        Crow crow=new Crow();
        crow.age();
        crow.colour();
        crow.weight();
        crow.height();
        crow.gender();

        BirdCast birdCast=new BirdCast();
        birdCast.apply(bird);
        birdCast.apply(crow);
    }

}
