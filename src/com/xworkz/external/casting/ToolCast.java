package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Tool;
import com.xworkz.external.internal.Hammer;
import com.xworkz.external.internal.ZanduBalm;

public class ToolCast {
    public void apply(Tool tool){
        tool.cost();
        tool.toolName();
        tool.toolType();
        tool.size();
        tool.pieces();

        if(tool instanceof Hammer){
            Hammer hammer=new Hammer();
            hammer.beats();
        }
    }
}
