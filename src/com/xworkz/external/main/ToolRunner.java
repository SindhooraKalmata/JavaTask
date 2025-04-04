package com.xworkz.external.main;

import com.xworkz.external.Tool;
import com.xworkz.external.internal.Hammer;

public class ToolRunner {
    public static void main(String[] args) {
        Tool tool=new Tool();
        tool.toolType();
        tool.cost();
        tool.pieces();
        tool.toolName();
        tool.size();

        Tool tool1=new Hammer();
        tool1.toolType();
        tool1.toolName();
        tool1.size();
        tool1.cost();
        tool1.pieces();

        Tool tool2=new Hammer();
        tool2.toolType();
        tool2.toolName();
        tool2.size();
        tool2.cost();
        tool2.pieces();

        Tool tool3=new Hammer();
        tool3.toolType();
        tool3.toolName();
        tool3.size();
        tool3.cost();
        tool3.pieces();
    }
}
