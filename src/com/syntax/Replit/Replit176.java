package com.syntax.Replit;

public class Replit176 {
}
interface Parent2{
    void parentMethod();
}
interface Child2 {
    void childMethod();
}
class Main2 implements Child2, Parent2 {
    public void parentMethod(){
        System.out.println("Parent Method-welcome to Syntax");
    };
    public void childMethod(){
        System.out.println("Child Method-hello Syntax");
    };
}
