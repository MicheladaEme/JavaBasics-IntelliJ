package com.syntax.Class17;

import java.sql.SQLOutput;

public class Students {
    //Create a Class called Students
    //Create three variables Name, ID and numberOfStudents
    //Create three objects of the Students Class
    //Set the value for studentName, studentID and increment the numberOfStudents for each object
    //Print out  total number of students
    String name;
    int ID;
    static int numberOfStudents=0;

    void addStudent(){
        numberOfStudents+=1;
    }

    public static void main(String[] args) {
        Students student1=new Students();
        student1.name="Emely";
        student1.ID=932305;
        student1.addStudent();
        //Students.numberOfStudents++

        Students student2=new Students();
        student2.name="Pricila";
        student2.ID=932306;
        student2.addStudent();
        //Students.numberOfStudents++

        Students student3=new Students();
        student3.name="Angel";
        student3.ID=932307;
        student3.addStudent();
        //Students.numberOfStudents++

        System.out.println(numberOfStudents);



    }
}
