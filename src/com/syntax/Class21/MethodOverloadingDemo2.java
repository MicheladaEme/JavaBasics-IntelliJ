package com.syntax.Class21;

public class MethodOverloadingDemo2 {
    static void printInfo(String name, int age, double weight){
        System.out.println(name+" "+age+" "+weight);
    }
    static void printInfo( int age, String name, double weight){
        System.out.println(name+" "+age+" "+weight);
    }
    static void printInfo( int age, double weight, String name){
        System.out.println(name+" "+age+" "+weight);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo2 methodOverloadDemo=new MethodOverloadingDemo2();
        methodOverloadDemo.printInfo("Zulifya",16,28);

    }
}
