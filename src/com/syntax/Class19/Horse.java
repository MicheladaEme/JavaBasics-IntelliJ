package com.syntax.Class19;

public class Horse {
    //It is a very good practice to make the fields private
    private String name;
    private int age;
    private double weight;

    //No argument/zero argument constructor
    //horse(){
    /* Write some important lines of code that you want to execute when
    the object of a class is created for example
    You might want to fetch some info from internet or form your
    hard disk to give initial values to the fields
     */

    //purpose of constructor is to give initial values to the fields of a class
    Horse(String horseName, int horseAge, double horseWeight){
        name=horseName;
        age=horseAge;
        weight=horseWeight;
    }

    void printHorseName(){
        System.out.println("Name "+name);
    }

    void setName(String horseName){
        name=horseName;
    }
}
