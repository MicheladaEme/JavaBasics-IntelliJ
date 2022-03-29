package com.syntax.Class19;

public class HWTask3 {
    //Write a java class that have 4 constructors with 4 different access
    // levels of constructors(private,public,default,protected)
    // and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
    // 3 - from different class inside different package and observe result.

    private HWTask3(String word){
        System.out.println("priv");
    }
    HWTask3(double a){
        System.out.println("Def");
    }
    protected HWTask3(int num){
        System.out.println("pro");
    }
    public HWTask3(boolean a){
        System.out.println("pub");
    }


}
