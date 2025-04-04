package com.xworkz.main;

import com.xworkz.external.Bar;
import com.xworkz.internal.SportsBar;

public class BarRunner {
    public static void main(String[] args) {
        Bar bar = new Bar();
        bar.serveDrinks();
        bar.playMusic();
        bar.offerSeating();
        bar.maintainHygiene();
        bar.operateLateNight();

        Bar bar1 = new SportsBar();
        bar1.serveDrinks();
        bar1.playMusic();
        bar1.offerSeating();
        bar1.maintainHygiene();
        bar1.operateLateNight();

        Bar bar2 = new SportsBar();
        bar2.serveDrinks();
        bar2.playMusic();
        bar2.offerSeating();
        bar2.maintainHygiene();
        bar2.operateLateNight();

        Bar bar3 = new SportsBar();
        bar3.serveDrinks();
        bar3.playMusic();
        bar3.offerSeating();
        bar3.maintainHygiene();
        bar3.operateLateNight();
    }
    }
