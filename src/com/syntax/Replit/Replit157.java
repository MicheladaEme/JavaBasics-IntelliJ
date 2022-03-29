package com.syntax.Replit;

public class Replit157 {
}
class Parent1{
    public void m1(){
        System.out.println("m1 method in parent class");
    }
}
class Child1 extends Parent1{
    public void m1(){
        System.out.println("m1 method in child class");
    }
    public void m2(){
        this.m1();
        super.m1();
    }
}
