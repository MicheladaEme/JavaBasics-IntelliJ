package com.syntax.Class24;

public class Task1Tester {
    public static void main(String[] args) {
        Student syntaxStudent=new SyntaxStudent();
        Student schoolStudent=new SchoolStudent();
        /*
        as we can store the object of a child class in a parent class
        we can also create an array of these students as show below
         */
        //Every class in java can be treated as a data type
        Student[] students={new SyntaxStudent(),new SchoolStudent(),new CollegeStudent()};
        /*int[] arr={1,2,3};
        for(int number:arr){
        System.out.println(number);
        }
         */
        for(Student student:students){
            student.study();
            student.doHomeWork();
        }
    }
}
