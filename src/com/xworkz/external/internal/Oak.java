package com.xworkz.external.internal;

import com.xworkz.external.Tree;

public class Oak extends Tree {
    public Oak(){
        super();
        System.out.println("No arg const");
    }

    @Override
    public void place() {
        System.out.println("Running from child");
    }

    @Override
    public void NoOfTrees() {
        System.out.println("Running from child");
    }

    @Override
    public void treeAge() {
        System.out.println("Running from child");
    }

    @Override
    public void treeHeight() {
        System.out.println("Running from child");
    }

    @Override
    public void treeName() {
        System.out.println("Running from child");
    }
    public void grows(){
        System.out.println("Running from child");
    }
}
