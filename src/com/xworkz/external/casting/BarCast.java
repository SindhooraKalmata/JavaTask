package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Bar;
import com.xworkz.external.internal.SportsBar;
import com.xworkz.external.internal.ZanduBalm;

public class BarCast {
    public void apply(Bar bar){
        bar.maintainHygiene();
        bar.offerSeating();
        bar.operateLateNight();
        bar.playMusic();
        bar.serveDrinks();

        if(bar instanceof SportsBar){
            SportsBar sportsBar=new SportsBar();
            sportsBar.closed();
        }
    }
}
