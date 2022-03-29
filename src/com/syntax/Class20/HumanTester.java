package com.syntax.Class20;

public class HumanTester {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="Zuhoor";
        System.out.println(student.name);
        student.studentID="123";
        System.out.println("****************************");
        Principal principal=new Principal();
        principal.name="Guldan";
        principal.printName();
        principal.specialParkingSlot=false;
    }
}
