package com.syntax.Class20;

public class ChemistryTeacher extends Teacher {

    void Lab(){
        System.out.println("Today I will teach a Lab");
    }
    public static void main(String[] args) {
        ChemistryTeacher example4=new ChemistryTeacher();
        example4.teach();
        example4.Lab();
    }
}
