package com.syntax.Class20;

public class ClassB extends ClassA{
    char gender;

    void printInfo(){
        System.out.println(name);
        System.out.println(gender);
    }

    public static void main(String[] args) {
        ClassB task2=new ClassB();
        task2.printF();
    }
}
