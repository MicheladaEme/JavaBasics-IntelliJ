package com.syntax.Class19;

public class HWTask5 {
    //Write a Student class that have instance variables name and address.
    // Create a constructor that will initialize those variables.
    // Print name & address of given student using displayInfo method.

    String name;
    String address;

    public HWTask5(String name, String address) {
        this.name = name;
        this.address = address;
    }
    void displayInfo(){
        System.out.println(name+" "+address);
    }

    public static void main(String[] args) {
        HWTask5 student=new HWTask5("Emely","123 23rd street");
        student.displayInfo();
    }
}
