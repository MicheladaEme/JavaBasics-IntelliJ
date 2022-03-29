package com.syntax.Replit;

public class Replit154 {
    public static void main(String[] args){
        //Child oldest=new Child();
        Child youngest=new Child(10);
    }
}
class Parent{
    public Parent(){
        System.out.println("Parent Constructor without argument");
    }
    public Parent(int number){
        System.out.println(number);
    }
}
 class Child extends Parent{
    public Child(int number){
        //super.Parent();
        System.out.println("Child Constructor without argument");
    }
}
