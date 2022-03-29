package com.syntax.Class20;

public class Teacher {
    //Write a Java program called Teacher.
    // Identify features and behaviour of that Class. Create 3 subclasses MathTeacher,
    // ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
    // Test all 4 classes
    String name;
    String age;
    String employeeId;

    void teach(){
        System.out.println("Today I will teach");
    }

    public static void main(String[] args) {
        Teacher example=new Teacher();
        example.teach();
    }

}
