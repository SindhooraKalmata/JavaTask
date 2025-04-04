package com.xworkz.main;

import com.xworkz.external.Furniture;
import com.xworkz.internal.Table;

public class FurnitureRunner {
    public static void main(String[] args) {
        Furniture furniture=new Furniture();
        furniture.furnitureName();
        furniture.cost();
        furniture.shape();
        furniture.pieces();
        furniture.wood();

        Furniture furniture1=new Table();
        furniture1.furnitureName();
        furniture1.wood();
        furniture1.shape();
        furniture1.cost();
        furniture1.pieces();

        Furniture furniture2=new Table();
        furniture2.furnitureName();
        furniture2.wood();
        furniture2.shape();
        furniture2.cost();
        furniture2.pieces();

        Furniture furniture3=new Table();
        furniture3.furnitureName();
        furniture3.wood();
        furniture3.shape();
        furniture3.cost();
        furniture3.pieces();
    }
}
