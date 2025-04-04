package com.xworkz.main;

import com.xworkz.external.Student;
import com.xworkz.internal.Sindhu;

public class StudentRunner {
    public static void main(String[] args){
        Student student=new Student();
        student.branch();
        student.city();
        student.collage();
        student.usn();
        student.name();

        Student student1=new Sindhu();
        student1.name();
        student1.usn();
        student.collage();
        student1.city();
        student1.branch();

        Student student2=new Sindhu();
        student2.name();
        student2.usn();
        student2.collage();
        student2.city();
        student2.branch();

        Student student3=new Sindhu();
        student3.name();
        student3.usn();
        student3.collage();
        student3.city();
        student3.branch();
    }
}
