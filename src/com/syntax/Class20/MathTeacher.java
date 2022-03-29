package com.syntax.Class20;

public class MathTeacher extends Teacher {

    void Geometry(){
        System.out.println("Today I will teach Geometry");
    }

    void Algebra(){
        System.out.println("Today I will teach Algebra");
    }

    public static void main(String[] args) {
        MathTeacher example3=new MathTeacher();
        example3.teach();
        example3.Algebra();
    }
}
