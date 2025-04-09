package com.xworkz.external.main;

import com.xworkz.external.Tool;
import com.xworkz.external.casting.ToolCast;
import com.xworkz.external.internal.Hammer;
import com.xworkz.external.internal.Himalaya;

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

        Hammer hammer=new Hammer();
        hammer.beats();
        hammer.cost();
        hammer.size();
        hammer.toolName();
        hammer.beats();
        hammer.pieces();

        ToolCast toolCast=new ToolCast();
        toolCast.apply(tool);
        toolCast.apply(hammer);
    }
}
