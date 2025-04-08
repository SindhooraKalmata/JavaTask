package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Education;
import com.xworkz.external.internal.College;
import com.xworkz.external.internal.ZanduBalm;

public class EducationCast {
    public void apply(Education education){
        education.activity();
        education.certificates();
        education.events();
        education.exams();
        education.teach();

        if(education instanceof College){
            College college=new College();
            college.sport();
        }
    }
}
