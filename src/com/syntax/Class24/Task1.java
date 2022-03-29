package com.syntax.Class24;

public class Task1 {
    //Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    //Define common behavior within parent class and override some methods in child classes
    //Define some methods specific to child classes
    //Write example of achieving run time polymorphism

}
class Student{
    String name;
    int age;
    String studentID;
    void study(){
        System.out.println("Students must study to pass");
    }
    void doHomeWork(){
        System.out.println("Students must do homeworks");
    }
}
class SyntaxStudent extends Student{
    void study(){
        System.out.println("Syntax students must study 25 hours a week");
    }
    void doHomeWork(){
        System.out.println("Syntax Student must do replits");
    }
    void youtubeResearch(){
        System.out.println("Syntax students must watch Java youtube videos");
    }
}
class CollegeStudent extends Student{
    void study(){
        System.out.println("College students must study 20 hours a week");
    }
    void doHomeWork(){
        System.out.println("College Student must do their thesis");
    }
}
class SchoolStudent extends Student{
    void study(){
        System.out.println("School students must study 15 hours a week");
    }
    void afterSchool(){
        System.out.println("School students stay afterschool for sports");
    }
}



