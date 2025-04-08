package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Tool;
import com.xworkz.external.Tree;
import com.xworkz.external.internal.Oak;
import com.xworkz.external.internal.ZanduBalm;

public class TreeCast {
    public void apply(Tree tree){
        tree.NoOfTrees();
        tree.treeAge();
        tree.treeHeight();
        tree.place();
        tree.treeName();

        if(tree instanceof Oak){
            Oak oak=new Oak();
            oak.grows();
        }
    }
}
