import Employee;
package Incapsulation;
import Inheritance.*;
class Test {
    public static void main(String[] args) {

        // Employee er = new Employee("Omprakash",54321);
        Employee er2 = new Employee();
        Me mera = new Me();
        System.out.println(mera.name);
        System.out.println(mera.surname);


        // System.out.println(er.getName());
        // System.out.println(er.getph());
        
        // er2.setName("JPM");
        // er2.setPh(629955);
        // System.out.println(er2.getName());
        // System.out.println(er2.getph());


    }
}