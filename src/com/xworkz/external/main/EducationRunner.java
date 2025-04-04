package com.xworkz.external.main;

import com.xworkz.external.Education;
import com.xworkz.external.internal.College;

public class EducationRunner {
    public static void main(String[] args) {
        Education education = new Education();
        education.activity();
        education.certificates();
        education.events();
        education.exams();
        education.teach();

        Education education1 = new College();
        education1.activity();
        education1.certificates();
        education1.events();
        education1.exams();
        education1.teach();

        Education education2 = new College();
        education2.activity();
        education2.certificates();
        education2.events();
        education2.exams();
        education2.teach();

        Education education3 = new College();
        education3.activity();
        education3.certificates();
        education3.events();
        education3.exams();
        education3.teach();
    }
}
