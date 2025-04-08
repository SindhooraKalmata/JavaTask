package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Student;
import com.xworkz.external.internal.Sindhu;
import com.xworkz.external.internal.ZanduBalm;

public class StudentCast {
    public void apply(Student student){
        student.branch();
        student.city();
        student.collage();
        student.usn();
        student.name();

        if(student instanceof Sindhu){
            Sindhu sindhu=new Sindhu();
            sindhu.attend();
        }
    }
}
