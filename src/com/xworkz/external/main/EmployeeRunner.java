package com.xworkz.external.main;

import com.xworkz.external.Employee;
import com.xworkz.external.internal.Manager;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.department();
        employee.eat();
        employee.salary();
        employee.work();
        employee.timepass();

        Employee employee1 = new Manager();
        employee1.department();
        employee1.eat();
        employee1.salary();
        employee1.work();
        employee1.timepass();
    }

}