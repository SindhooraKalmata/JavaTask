package com.xworkz.main;

import com.xworkz.external.College;
import com.xworkz.internal.Campus;
public class CollegeRunner {
    public static void main(String[] args) {
        College college=new College();
        college.construction();
        college.library();
        college.lecturers();
        college.students();
        college.rating();

        System.out.println("--------------------------------");

        College college1=new College();
        college1.construction();
        college1.library();
        college1.lecturers();
        college1.students();
        college1.rating();

        System.out.println("--------------------------------");
    }
}