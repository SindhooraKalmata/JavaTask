package com.xworkz.external.main;

import com.xworkz.external.Tea;
import com.xworkz.external.internal.RedLabel;

public class TeaRunner {
    public static void main(String[] args) {
        Tea tea=new Tea();
        tea.quantity();
        tea.teaBrand();
        tea.price();
        tea.teaFlavour();
        tea.sugarOrSugarless();

        Tea tea1=new RedLabel();
        tea1.sugarOrSugarless();
        tea1.teaFlavour();
        tea1.price();
        tea1.teaBrand();
        tea1.quantity();

        Tea tea2=new RedLabel();
        tea2.sugarOrSugarless();
        tea2.teaFlavour();
        tea2.price();
        tea2.teaBrand();
        tea2.quantity();

        Tea tea3=new RedLabel();
        tea3.sugarOrSugarless();
        tea3.teaFlavour();
        tea3.price();
        tea3.teaBrand();
        tea3.quantity();
    }
}
